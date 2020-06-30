/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Computes NibbleMonster to keep asking for nibbles until its not a nibble then Do-while loop will exit.
*/
import java.util.Scanner;

public class NibbleMonster2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("I require a fresh blood sacrifice to consume!! \n");

        do { //Wow I'm inpress do while are a heck a lot more convenient
        System.out.print("Feed Mirror Xnibblet: ");
        char ch = in.next().charAt(0); //food

        //Note: chapter 4.3.4 comparing and testing + Used code from original HW2 NibbleMonster
           if ((ch >= '0') && (ch <= '9')) {
               System.out.println( "nom nommm Excellent soul you adquire");
               System.out.println("Me hungry, me want more");
           }
              else if ((ch >= 'A') && (ch <= 'F')) { 
                  System.out.println( "hmmm Not bad quite the taste");
                  System.out.println("Me hungry, me want more");
              }
                 else if ((ch >= 'a') && (ch <= 'f')) {
                     System.out.println( "yum not half bad");
                     System.out.println("Me hungry, me want more");
                 }
                    else  {
                     System.out.println( "Uhhggg that is the worst thing I had ever had, I guess I have no choice but to eat you now");
                     break;
                    }
        } while (true);             
    }
}