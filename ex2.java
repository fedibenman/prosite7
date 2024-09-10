import java.util.*;
public class ex2{
        int nbrCages = 0  ;
        String zooName = "";
    public static void main(String args[]){

        ex2 zoo  = new ex2();
        Scanner input = new Scanner(System.in);
        while(zoo.nbrCages <= 0){ 
            System.out.println("Enter the nbrCages (not negative and not 0):");
        zoo.nbrCages = input.nextInt();
        }
       while(zoo.zooName.length() == 0){
           
       
        System.out.println("Enter the zooName(not empty):");
        zoo.zooName = input.next();}
        System.out.println( zoo.zooName + "contains " + zoo.nbrCages+" cages");
         }
}