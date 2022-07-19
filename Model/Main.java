package Model;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*Add data*/
        String[] coursesType = {"Analiza", "Algebra", "Robotyka", "PAMSI", "PPS", "MUD", "PEIE", "CPOIS"};
        String[] lecturesName = {"Kowalski", "Nowak", "Ptak", "Deter", "Mazur", "Kowal", "Wenuk", "Taczyn"};

        List<Course> courses1 = new ArrayList<>();
        List<Course> courses2 = new ArrayList<>();

        for (int i = 0; i < coursesType.length; i++) {
            Course course = new Course(coursesType[i], lecturesName[i], i + 1);
            courses1.add(course);
            if (i % 2 == 0) {
                courses2.add(course);
            }
        }
        courses2.add(new Course(".NET", "Mysz", 5));
        courses2.add(new Course("SPD", "Pszczelarz", 6));

        Faculty faculty1 = new Faculty("WEFIM", "W12",2000);
        Faculty faculty2 = new Faculty("WIT", "W4",2200);
        Faculty faculty3 = new Faculty("WPPT","W11",1800);


        Student student1 = new Student(252954, "Aleksandra", "Rozmaryn", Student.Gender.FEMALE, 22, faculty1, courses1);
        Student student2 = new Student(252955, "Aleksandra", "Potezny-Grzyb", Student.Gender.FEMALE, 21, faculty2, courses1); //TODO xD potezny-grzyb
        Student student3 = new Student(252956, "Dominik", "Łydka", Student.Gender.MALE, 23, faculty2, courses2);
        Student student4 = new Student(252957, "Julian", "Kabanos", Student.Gender.MALE, 22, faculty3, courses2);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        /*Filter*/
        System.out.println("--FILTER EXAMPLE---:");
        System.out.println("The same name:");
        List<Student> names = students.stream()
                .filter(student -> student.getName().equals("Aleksandra"))
                .collect(Collectors.toList());
        names.forEach(name -> System.out.println(name.getName() + " " + name.getLastName()));

        System.out.println("\nID larger than 252954 :");
        students.stream()
                .filter(student -> student.getId() > 252954)
                .collect(Collectors.toList())
                .forEach(id -> System.out.println(id.getName() + " " + id.getId()));

        /*Map*/
        System.out.println("\n---MAP EXAMPLE:---");
        students.stream()
                .map(student -> student.getFaculty().getName())
                .collect(Collectors.toList())//TODO if there are some duplications of the courses and you just want the names, maybe a set would be better here
                .forEach(System.out::println);

        System.out.println("\n---MAP EXAMPLE:--- --with Set (now there are no duplications");
        students.stream()
                .map(student -> student.getFaculty().getName())
                .collect(Collectors.toSet())//TODO if there are some duplications of the courses and you just want the names, maybe a set would be better here
                .forEach(System.out::println);

        /*Min/max*/
        System.out.println("\n---MIN/MAX EXAMPLE:---");
        Student minObject = students.stream()
                .min(Comparator.comparing(student -> student.getFaculty().getNumberOfStudents()))
                .get();
        System.out.println("Min number of students: "+minObject.getFaculty().getNumberOfStudents());
        Student maxObject = students.stream()
                .max(Comparator.comparing(student -> student.getFaculty().getNumberOfStudents()))
                .get();
        System.out.println("Max number of students: " + maxObject.getFaculty().getNumberOfStudents());


        /*GroupingBy*/
        System.out.println("\n---GROUPINGBY---");
        //TODO just a question -> you wrote the var here on purpose?
        var groupByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.mapping(Student::getLastName,Collectors.toList()))); //TODO you could split that into a few lines -> would be more clear
        System.out.println("Group by gender:");
        System.out.println(groupByGender);


        var groupByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getLastName,Collectors.toList())));
        System.out.println("Group by age:");
        System.out.println(groupByAge);

        double averageAge = students.stream()
                .mapToDouble(Student::getAge)
                .average()
                .getAsDouble();
        System.out.println("Average age: " + averageAge);

        //TODO good ;)
        // About this grouping by example -> you could also write sth that uses the grouping by along with the averaging function, e.g.
        //an average age grouped by gender
        Map<Student.Gender, Double> avgAgeByGender = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getAge)));

        System.out.println(avgAgeByGender);

    }

}
