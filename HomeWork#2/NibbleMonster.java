/* 
   Axel Montes Salazar
   306126956
   CS2011-05
   
   Computes char values and displays a message after feeding it to the console
*/ 

import java.util.Scanner;

public class NibbleMonster {
    public static void main(String[] args) {   //nibble means HEX numbers (base 16 digits) ex) 0 1 2 3 4 5 6 7 8 9 A=10 B=11 C=12 D=13 E=14 F=15
        Scanner in = new Scanner(System.in);

        System.out.print(" (◣_◢)/ I require a fresh blood sacrifice to consume!!"); //Got to have some since of humor on these assignments, thinking of a great idea for a game.

        System.out.print("Feed Mirror Xnibblet: ");
        char ch = in.next().charAt(0); //food
        
        //Note: chapter 4.3.4 comparing and testing 
           if ((ch >= '0') && (ch <= '9')) {
               System.out.println( "nom nommm Excellent soul you adquire o(≧▽≦)o ");
           }
              else if ((ch >= 'A') && (ch <= 'F')) { 
                  System.out.println( "hmmm Not bad quite the taste ( ͡° ͜ʖ ͡°) ");
              }
                 else if ((ch >= 'a') && (ch <= 'f')) {
                     System.out.println( "yum not half bad (╯°□°)╯ ");
                 }
                    else  {
                     System.out.println( "Uhhggg that is the worst thing I had ever had, I guess I have no choice but to eat you now ლ(ಠ益ಠლ) ");
                    }
        
        
    }
}