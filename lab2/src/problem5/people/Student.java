package problem5.people;

public class Student extends Person {

    protected String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getOccupation() {
        return "Student of " + major;
    }
}