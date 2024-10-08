package tn.esprit.gestionzoo.entities;

public class Penguin extends Terrestrial{
private float swimmingDepth ; 

public Penguin(String name, int age, boolean isMammal, int nbrLegs, float swimmingDepth) {
    super(name, age, isMammal, nbrLegs);
    this.swimmingDepth = swimmingDepth;

}
}