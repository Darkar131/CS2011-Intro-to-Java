/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Computes order in which dice are trow with random landing [1 to 6]
   Version: 2
   New Update:
   -New Dice display interface
*/
//Unfortunately, I was not able to successfully get the string to be store in a random variable, but I tried.

import java.util.Random;
public class FiveDice1{
    public static void main(String[] args) {
        Random random = new Random();
 
        String dice1 =       "         \n"
                        + "+-------+\n"
                        + "|       |\n"
                        + "|   *   |\n"
                        + "|       |\n"
                        + "+-------+" 
                        ;
        String dice2 =    "         \n"
                        + "+-------+\n"
                        + "|   *   |\n"
                        + "|       |\n"
                        + "|   *   |\n"
                        + "+-------+\n";
        String dice3 =    "         \n"
                        + "+-------+\n"
                        + "|   *   |\n"
                        + "|   *   |\n"
                        + "|   *   |\n"
                        + "+-------+\n";
        String dice4 =    "         \n"
                        + "+-------+\n"
                        + "| *   * |\n"
                        + "|       |\n"
                        + "| *   * |\n"
                        + "+-------+";               
        String dice5 =     "         \n"
                        + "+-------+\n"
                        + "| *   * |\n"
                        + "|   *   |\n"
                        + "| *   * |\n"
                        + "+-------+\n";
        String dice6 =    "         \n"
                        + "+-------+\n"
                        + "| *   * |\n"
                        + "| *   * |\n"
                        + "| *   * |\n"
                        + "+-------+\n"; 

        char faceDice1 = dice1.charAt('A');
        char faceDice2 = dice2.charAt('B');
        char faceDice3 = dice3.charAt('C');
        char faceDice4 = dice4.charAt('D');
        char faceDice5 = dice5.charAt('E');
        char faceDice6 = dice6.charAt('F');

        //String diceRandom = "" + 'A' + 'B' + 'C' + 'D' + 'E' + 'F';

        for (int count = 1 ; count <= 5; ) {                   
        String diceFace;

        switch (count) {
        case 1: 
            diceFace= "First";
            System.out.println(dice1);
            ++count;
        case 2:
            diceFace = "Second";
            System.out.print(dice2);
            ++count;
        case 3:
            diceFace = "Third";
            System.out.print(dice3);
            ++count;
        case 4:
            diceFace = "Fourth";
            System.out.print(dice4);
            ++count;
        case 5:
            diceFace = "Fifth";
            System.out.print(dice5);
            ++count;    
        }
        }//end for()

    }
}