package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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

        Faculty faculty1 = new Faculty("WEFIM", "W12");
        Faculty faculty2 = new Faculty("WIT", "W4");
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);

        Student student1 = new Student(252954, "Aleksandra", "Rozmus", "female", faculty1, courses1);
        Student student2 = new Student(252955, "Aleksandra", "Grzyb", "female", faculty2, courses1);
        Student student3 = new Student(252956, "Dominik", "Łydka", "male", faculty2, courses2);
        Student student4 = new Student(252957, "Julian", "Kabanos", "male", faculty1, courses2);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        /*Filter*/
        System.out.println("--FILTER EXAMPLE---:");
        System.out.println("The same name:");
        List<Student> names = students.stream()
                .filter(c -> c.getName().equals("Aleksandra"))
                .collect(Collectors.toList());
        names.forEach(name -> System.out.println(name.getName() + " " + name.getLastName()));

        System.out.println("\nID larger than 252954 :");
        List<Student> idList = students.stream()
                .filter(c -> c.getId() > 252954)
                .collect(Collectors.toList());
        idList.forEach(id -> System.out.println(id.getName() + " " + id.getId()));




    }

}
