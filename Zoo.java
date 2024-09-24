public class Zoo{
  public Animal [] animals ; 
  public String name ; 
  public String city ; 
  public final int nbrCages ; 
  public int nbAnimal = 0 ; 

  public Zoo(String name,String city, int nbrCages){
    animals = new Animal[25] ;
    this.name = name ; 
    this.city = city ; 
    this.nbrCages = nbrCages ; 
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

  int searchAnimal(Animal animal){

    for (int i = 0 ; i < nbAnimal ; i++){
      System.err.println("the int" + i + "animal" + animals[i]);
      if (animals[i].name.equals(animal.name))
      return i ;
    }
    return -1 ;
  }
}