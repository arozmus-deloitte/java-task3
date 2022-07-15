package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        char name = 'A';
        for (int i = 1; i < 10; i++) {

            Course course = new Course("Course"+String.valueOf(name)+String.valueOf(name), "Lecturer." + String.valueOf(i), i);
            courses.add(course);
            name++;
        }

        Faculty faculty1 = new Faculty("WEFIM", "W12");
        Faculty faculty2 = new Faculty("WIT", "W4");

        Student student1 = new Student(252954, "Aleksandra", "Rozmaryn", faculty1, courses);
        Student student2 = new Student(252222, "Aleksandra", "Grzyb", faculty2, courses);
        Student student3 = new Student(252800, "Dominik", "Łydka", faculty1, courses);
        Student student4 = new Student(252800, "Julian", "Kabanos", faculty2, courses);

    }
}
