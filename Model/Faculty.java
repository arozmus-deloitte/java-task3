package Model;

public class Faculty {
    //TODO fields should be private -> OOP encapsulation rule
    String name;
    String number;
    // TODO unnecessary empty line
   int numberOfStudents;

    public Faculty(String name, String number, int numberOfStudents) {
        this.name = name;
        this.number = number;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
