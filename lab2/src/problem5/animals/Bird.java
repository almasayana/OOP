package problem5.animals;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Tweet";
    }
}