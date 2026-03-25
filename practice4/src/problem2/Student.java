package problem2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {

    public Student(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println(name + " is retaking the exam...");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }
}