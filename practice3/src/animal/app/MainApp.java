package animal.app;

import animal.model.Animal;
import animal.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Dog("Some animal", 10, "Poodle");
        
        Dog dog1 = new Dog("Aktos", 3, "German Shepherd");
        Dog dog2 = new Dog("Buddy", 5, "Poodle ");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(dog1);
        animalList.add(dog2);

        for (Animal a : animalList) {
            a.getInfo();      
            a.makeSound();    
            a.eat("some snacks"); 
            System.out.println("---------------------------------");
        }
    }
}