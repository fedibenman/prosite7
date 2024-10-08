package tn.esprit.gestionzoo.entities;
public class Animal{
    public String name ; 
    public int age ; 
    public boolean isMammal ;
    


    public Animal (String name, int age, boolean isMammal){
        this.name = name ; 
        setAge(age); 
        this.isMammal = isMammal ; 
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive. Setting age to 1.");
            this.age = 1; // Default to 1 if the input is non-positive
        }
    }




    public String toString(){
        return  name + " " + age + " " + isMammal ;
    }


}