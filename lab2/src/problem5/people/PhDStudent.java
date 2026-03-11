package problem5.people;

import problem5.animals.*;

public class PhDStudent extends Student {

    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public void assignPet(Animal pet) {

        if (pet instanceof Dog) {
            System.out.println("PhD students cannot have dogs.");
            return;
        }

        super.assignPet(pet);
    }

    public String getOccupation() {
        return "PhD Student researching " + researchTopic;
    }
}