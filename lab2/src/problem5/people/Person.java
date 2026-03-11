package problem5.people;

import problem5.animals.Animal;
import problem5.animals.Dog;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void leavePetWith(Person other) {

        if (pet == null) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        if (other.hasPet()) {
            System.out.println(other.name + " already has a pet.");
            return;
        }

        if (other instanceof PhDStudent && pet instanceof Dog) {
            System.out.println("PhDStudent cannot take care of dogs.");
            return;
        }

        other.assignPet(pet);
        this.removePet();
    }

    public void retrievePetFrom(Person other) {

        if (!other.hasPet()) {
            System.out.println(other.name + " does not have your pet.");
            return;
        }

        this.assignPet(other.pet);
        other.removePet();
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        if (pet != null) {
            return name + " (" + getOccupation() + ") - pet: " + pet;
        } else {
            return name + " (" + getOccupation() + ") - no pet";
        }
    }
}