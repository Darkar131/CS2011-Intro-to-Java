/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Computes NibbleMonster to keep asking for nibbles until its not a nibble then while loop will exit.
*/
import java.util.Scanner;
import java.util.Random;

public class NibbleMonster3 {
    public static void main(String[] args) {

        Scanner theOneWhoWatches = new Scanner(System.in);
        System.out.print("I require a fresh blood sacrifice to consume!! \n");
        
        Random random = new Random();

        int tummyHungry = 0;
        int randomFull = random.nextInt(10);
        do {
        System.out.print("Feed Mirror SupremeXnibblet: ");
        char deliciousFood = theOneWhoWatches.next().charAt(0); //food

        //Note: chapter 4.3.4 comparing and testing + Used code from original HW2 NibbleMonster
           if ((deliciousFood >= '0') && (deliciousFood <= '9')) {
               System.out.println( "nom nommm Excellent soul you adquire");
               System.out.println("Me hungry, me want more");
               tummyHungry++;
           }
              else if ((deliciousFood >= 'A') && (deliciousFood <= 'F')) { 
                  System.out.println( "hmmm Not bad quite the taste");
                  System.out.println("Me hungry, me want more");
                  tummyHungry++;
              }
                 else if ((deliciousFood >= 'a') && (deliciousFood <= 'f')) {
                     System.out.println( "yum not half bad");
                     System.out.println("Me hungry, me want more");
                     tummyHungry++;
                 }
                    else  {
                     System.out.println( "Uhhggg that is the worst thing I had ever had, I guess I have no choice but to eat you now");
                     tummyHungry--; //Expands his hunger, since you are living immortal he can eat you as many times as he pleases until he gets something more tasty
                     
                    }
        } while (tummyHungry <= randomFull);  
        System.out.println("I'm full, you go away now. Come back once you hear the roar of my tummy");  
        
    }
}