import java.util.*;
public class ZooManagement{
    public static void main(String args[]){
Animal lion = new Animal("cats", "lion", 15, true);
Zoo myzoo = new Zoo("myzoo", "Bizerte", 10);     
myzoo.animals[0] = lion;
System.err.println(lion.toString());
System.out.println(myzoo.toString());
}
}