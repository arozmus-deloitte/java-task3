package Model;

import java.util.List;

public class Student {
    //TODO fields should be private
    int id;
    String name;
    String lastName;
    Gender gender;
    int age;
    Faculty faculty;
    List<Course> courses;

    enum Gender {
        FEMALE,
        MALE
    }

    //TODO it is not a failure in scope of this task - but for future -> we should avoid objects that have so many parameters in a constructor
    //Then maybe it is better to introduce some builder class/make more use of setters methods
    //TODO or at least change the formatting to:
//    public Student(
//            int id,
//            String name,
//            String lastName,
//            Gender gender,
//            int age,
//            Faculty faculty, List<Course> courses) {
//    }

    public Student(int id, String name, String lastName, Gender gender, int age, Faculty faculty, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
