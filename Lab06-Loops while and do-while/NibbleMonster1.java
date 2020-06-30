/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Computes NibbleMonster to keep asking for nibbles until its not a nibble then while loop will exit.
*/
import java.util.Scanner;

public class NibbleMonster1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("I require a fresh blood sacrifice to consume!! \n");

        while (true){ //while statement is true it will run again
        System.out.print(" Feed Mirror Xnibblet: ");
        char ch = in.next().charAt(0); //food
        //Note: chapter 4.3.4 comparing and testing + Used code from original HW2 NibbleMonster
            if ((ch >= '0') && (ch <= '9')) {
               System.out.println( " nom nommm Excellent soul you adquire");
               System.out.println("GIVE ME MORE PEASANT");
               String iWantMore = in.nextLine(); 
               boolean again = iWantMore.equals( (ch >= '0') && (ch <= '9')); //if the user inputs anything from 0 to 9 it will ask for more food
            }
                else if ((ch >= 'A') && (ch <= 'F')) { 
                  System.out.println( " hmmm Not bad quite the taste");
                  System.out.println("GIVE ME MORE PEASANT");
                  String iWantMore = in.nextLine(); 
                  boolean again = iWantMore.equals( (ch >= 'A') && (ch <= 'F')); //if the user inputs anything from A to F it will ask for more food
                
                }
                    else if ((ch >= 'a') && (ch <= 'f')) {
                    System.out.println( " yum not half bad,");
                    System.out.println("GIVE ME MORE PEASANT");
                    String iWantMore = in.nextLine(); 
                    boolean again = iWantMore.equals( (ch >= 'a') && (ch <= 'f')); //if the user inputs anything from a to f it will ask for more food  
                
                 }      
                        else {      
                        System.out.print("Uhhggg that is the worst thing I had ever had, I guess I have no choice but to eat you now");  
                        break;
                        }                                     
        }                           
    }
}