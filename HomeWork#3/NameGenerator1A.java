/*
   Axel Montes Salazar
   306126956
   CS2011-05
 
   Version 1.2.0
   New update: New Features;
   -Random Generator that displays work satisfaction message

   Appearance Rate;
   - 20% for Lengendary Pull
   - 80% for a common pull
    
*/
import java.util.Random;
import java.util.Scanner; 
public class NameGenerator1A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name length: ");
        int enter = in.nextInt();

        Random random = new Random();
        int lottery = random.nextInt(10);

        {
        for(int i = 0; i < 1; i++)
            if(enter <= 0) {
                System.out.println("The length must be at least 1"); //if length is not equal to 1 or more then trigger this if-statement
            } 
                System.out.print( (char) ('A' + Math.random() * ('Z' - 'A' + 1)) ); //First letter will be upper case

                for(int i = 1; i < enter; i++){
                System.out.print( (char) ('a' + Math.random() * ('z' - 'a' + 1)) ); //Anything after it, will become lower case
                }          
        }
        if (lottery <= 2) {  
            System.out.println("" + " WoW amazing pull, you got a Legendary hero");  
        }   
        else {
            System.out.println("" + " not the best pull, you got a Common hero"); 
        }  

    } 
       
}
 