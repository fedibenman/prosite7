package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.ZooFullException;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.InvalidAgeException;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("City Zoo", "Springfield", 3);

        try {
            Animal lion = new Animal("Lion", 5, true);
            zoo.addAnimal(lion);

            Animal tiger = new Animal("Tiger", 4, true);
            zoo.addAnimal(tiger);

            Animal bear = new Animal("Bear", 2, true);
            zoo.addAnimal(bear);

            // This should throw a ZooFullException.
            Animal elephant = new Animal("Elephant", 6, true);
            zoo.addAnimal(elephant);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            // This should throw an InvalidAgeException.
            Animal negativeAgeAnimal = new Animal("Penguin", -3  , true);
            zoo.addAnimal(negativeAgeAnimal);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
