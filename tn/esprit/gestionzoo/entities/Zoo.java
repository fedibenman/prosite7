package tn.esprit.gestionzoo.entities;
public class Zoo{
  public Animal [] animals ; 
  public String name ; 
  public String city ; 
  public int nbrCages = 25  ; 
  public int nbAnimal = 0 ;  
  public int nbAquaticAnimal = 0 ;
  public Aquatic[] AquaticAnimals = new Aquatic[10];

  public Zoo(String name,String city, int nbrCages){
    animals = new Animal[25] ;
    this.name = name ; 
    this.city = city ; 
  }
  public Zoo(){} ;

  public String toString(){ 
    return name + " " + city + " " + nbrCages ; 
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

public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
  if (animal.age < 0) {
      throw new InvalidAgeException("Animal age cannot be negative: " + animal.age);
  }
  if (nbAnimal >= nbrCages) {
      throw new ZooFullException("The zoo is full. Cannot add more animals.");
  }
  if (searchAnimal(animal) != -1) {
      System.out.println("Animal already exists in the zoo.");
  } else {
      animals[nbAnimal] = animal;
      nbAnimal++;
  }
  System.out.println("Number of animals after addition: " + nbAnimal);
}

int searchAnimal(Animal animal) {
  for (int i = 0; i < nbAnimal; i++) {
      if (animals[i] != null && animals[i].name.equals(animal.name))
          return i;
  }
  return -1;
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


      public void addAquaticAnimal(Aquatic aquatic) {
        if (nbAquaticAnimal < AquaticAnimals.length) {
            AquaticAnimals[nbAquaticAnimal] = aquatic;
            nbAquaticAnimal++;
        } else {
            System.out.println("Cannot add more aquatic animals; array is full.");
        }
    }

    public float maxPenguinSwimmingDepth() {
      float maxDepth = 0;
      for (int i = 0; i < nbAquaticAnimal; i++) {
          if (AquaticAnimals[i] instanceof Penguin) {
              Penguin penguin = (Penguin) AquaticAnimals[i];
              if (penguin.swimmingDepth > maxDepth) {
                  maxDepth = penguin.swimmingDepth;
              }
          }
      }
      return maxDepth;
  }
  

  public void displayNumberOfAquaticsByType() {
    int nbPenguin = 0;
    int nbDolphin = 0;
    for (int i = 0; i < nbAquaticAnimal; i++) {
        if (AquaticAnimals[i] instanceof Penguin) {
            nbPenguin++;
        }
        if (AquaticAnimals[i] instanceof Dolphin) {
            nbDolphin++;
        }
    }
    System.out.println("Number of Penguins: " + nbPenguin);
    System.out.println("Number of Dolphins: " + nbDolphin);
}


}