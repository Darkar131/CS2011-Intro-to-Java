/*
   Axel Montes Salazar
   306126956
   CS2011-05
 
   Computes the Length of the user input and trows random letters with the first being upper case
   Version: 1.0.0 
   Game Release:
   - Welcome, come and play a random generator game in where it generates any letter base on the length you input.
   Hope you have fun and get some funny names if your lucky!
*/
import java.util.Scanner; 
public class NameGenerator1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name length: ");
        int enter = in.nextInt();
  
        for(int i = 0; i < 1; i++)
            if(enter <= 0) {
                System.out.println("The length must be at least 1"); //if length is not equal to 1 or more then trigger this if-statement
            } 
            else
                System.out.print( (char) ('A' + Math.random() * ('Z' - 'A' + 1)) ); //First letter will be upper case

                for(int i = 1; i < enter; i++){
                System.out.print( (char) ('a' + Math.random() * ('z' - 'a' + 1)) ); //Anything after it, will become lower case
                } 
                 
    }
}
