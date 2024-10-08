public class Zoo{
  public Animal [] animals ; 
  public String name ; 
  public String city ; 
  public final int nbrCages = 25  ; 
  public int nbAnimal = 0 ;  

  public Zoo(String name,String city, int nbrCages){
    animals = new Animal[25] ;
    this.name = name ; 
    this.city = city ; 
  }


  public String toString(){ 
    return name + " " + city + " " + nbrCages ; 
  }


  public boolean addAnimal(Animal animal){
    
    if (nbAnimal+1 > nbrCages)
    return false  ;
    if (searchAnimal(animal) != -1)
    return false  ; 
    animals[nbAnimal] = animal ; 
    nbAnimal++ ;
    return true  ;
  }


  public String getName() {
    return name;
}

// Setter for name (ensures name is not empty)
public void setName(String name) {
    if (name != null && !name.trim().isEmpty()) {
        this.name = name;
    } else {
        this.name = "not vide"; 
    }
}


  int searchAnimal(Animal animal){

    for (int i = 0 ; i < nbAnimal ; i++){
      System.err.println("the int" + i + "animal" + animals[i]);
      if (animals[i].name.equals(animal.name))
      return i ;
    }
    return -1 ;
  }

  boolean isZooFull(){

    if (nbAnimal == nbrCages)
    return true  ;
    return false  ;
  }

  boolean removeAnimal(Animal animal){
    if (searchAnimal(animal) == -1)
    return false  ;
    animals[searchAnimal(animal)] = null ;
    return true  ;
  }

Zoo comparerZoo(Zoo z1 , Zoo z2){

    if (z1.nbAnimal <= z2.nbAnimal)
    return z2 ;
    return z1 ;
      }

}