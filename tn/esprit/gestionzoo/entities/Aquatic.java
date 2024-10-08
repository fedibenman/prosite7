package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    String habitat ;
Aquatic( String name, int age, boolean isMammal , String habitat){
    super( name, age, isMammal);
    this.habitat = habitat ;
}
}
