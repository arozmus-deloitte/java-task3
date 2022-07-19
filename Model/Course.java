package Model;

public class Course {
    String name; //TODO fields should be private
    String lecturer;
    int ects;

    public Course(String name, String lecturer, int ects) {
        this.name = name;
        this.lecturer = lecturer;
        this.ects = ects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }
}
