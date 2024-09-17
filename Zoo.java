public class Zoo{
  public Animal [] animals ; 
  public String name ; 
  public String city ; 
  public int nbrCages ; 

  public Zoo(String name,String city, int nbrCages){
    animals = new Animal[25] ;
    this.name = name ; 
    this.city = city ; 
    this.nbrCages = nbrCages ; 
  }


  public String toString(){ 
    return name + " " + city + " " + nbrCages ; 
  }
}