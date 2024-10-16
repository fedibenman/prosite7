package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
   private  String habitat ;
public Aquatic( String name, int age, boolean isMammal , String habitat){
    super( name, age, isMammal);
    this.habitat = habitat ;
}

public abstract void swim() ; 



@Override
public boolean equals(Object obj) {
    Aquatic other = (Aquatic) obj;
    if (age != other.age)
        return false;
    if (habitat == null) {
        if (other.habitat != null)
            return false;
    } else if (!habitat.equals(other.habitat))
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name)) 
        return false;
    return true;
}

}