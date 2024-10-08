package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed ;

    public Dolphin(String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(name, age, isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    
}
