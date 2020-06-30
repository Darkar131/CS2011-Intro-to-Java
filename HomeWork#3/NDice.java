/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Generates random numbers depending how many dice you want to roll from a 6 face dice
*/
import java.util.Scanner;

public class NDice{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many dice would you like to roll? ");
        int rollsEnter = in.nextInt();


            System.out.print("Dice rolled: ");

            for (int count = 1; count <= rollsEnter; ++count)
            System.out.print(" " + (int) (7 + Math.random() * (1 - 7 )) );
            System.out.println();

            System.out.print("Generated number: ");
            for (int count = 1; count <= rollsEnter; count++)
            System.out.print( (int) (7 + Math.random() * (1 - 7 )) );
            System.out.println();

            /*
            Unfortunately I was not able to get a erroneous result. I was testing the String input to hold on the ouput 
            but that did not work out well. Therefore I left it as it is.
            */
    }
}