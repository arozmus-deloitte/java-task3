package Model;

import java.util.List;

public class Student {
    int id;
    String name;
    String lastName;
    String sex;
    Faculty faculty;
    List<Course> course;

    public Student(int id, String name, String lastName, String sex, Faculty faculty, List<Course> course) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.faculty = faculty;
        this.course = course;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

}