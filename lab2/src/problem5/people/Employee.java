package problem5.people;

public class Employee extends Person {

    private String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getOccupation() {
        return "Employee: " + position;
    }
}