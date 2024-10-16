package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
public float swimmingDepth ; 

public Penguin(String name, int age, boolean isMammal , String habitat , float swimmingDepth) {
    super(name, age, isMammal, habitat)  ;
    this.swimmingDepth = swimmingDepth;

}

public void swim(){
    System.out.println("Penguin is swimming");
}
}