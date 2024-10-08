package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs ;
    Terrestrial( String name, int age, boolean isMammal, int nbrLegs){
        super(name, age, isMammal);
        this.nbrLegs = nbrLegs ;

    }

}
