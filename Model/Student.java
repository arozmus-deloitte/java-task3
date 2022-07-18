package Model;

import java.util.List;

public class Student {
    int id;
    String name;
    String lastName;
    Sex sex;
    int age;
    Faculty faculty;
    List<Course> courses;

    enum Sex{
        FEMALE,
        MALE
    }

    public Student(int id, String name, String lastName, Sex sex, int age, Faculty faculty, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.faculty = faculty;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
