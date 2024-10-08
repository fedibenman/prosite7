import java.util.*;
public class ZooManagement{
    public static void main(String args[]){
Animal lion = new Animal("cats", "lion", 15, true);
Zoo myzoo = new Zoo("myzoo", "Bizerte", 10);     
for (int i = 0 ; i< 15 ;i++){
System.out.println(myzoo.addAnimal(lion));
}
System.err.println(lion.toString());
System.out.println(myzoo.toString());
}
}