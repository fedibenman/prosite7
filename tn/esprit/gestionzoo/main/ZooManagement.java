package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Dolphin;

public class ZooManagement {
    public static void main(String[] args) {
        // Create a zoo
        Zoo myzoo = new Zoo("myzoo", "Bizerte", 10);

        // Create and add some penguins
        for (int i = 0; i < 4; i++) {
            Penguin penguin = new Penguin("Penguin", 5 + i, false, "Arctic", 20.0f + i);
            myzoo.addAquaticAnimal(penguin);
            System.out.println(penguin);
            penguin.swim(); // Test the swim function for penguin
        }

        // Create and add some dolphins
        for (int i = 0; i < 4; i++) {
            Dolphin dolphin = new Dolphin("Dolphin", 6 + i, true, "Ocean", 30.0f + i);
            myzoo.addAquaticAnimal(dolphin);
            System.out.println(dolphin);
            dolphin.swim(); // Test the swim function for dolphin
        }

        // Test the max penguin swimming depth function
        float maxDepth = myzoo.maxPenguinSwimmingDepth();
        System.out.println("Maximum swimming depth of penguins: " + maxDepth);

        // Display the number of aquatics by type
        myzoo.displayNumberOfAquaticsByType();
    }
}
