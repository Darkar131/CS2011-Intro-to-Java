import java.util.Random;
import java.util.Scanner;
/* Notes: Math.random(); is another way to get random numbers
ex) 0.785213 *100=  (int)"remember to cast" 785213 = 72
*/
public class Lottery {

    public static void main(String[] args) {

        Random random = new Random();
        //int lottery = random.nextInt(100);
        long sysTime = System.currentTimeMillis();
        int lottery = (int) sysTime % 100;
        int guess;
        long system;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 for quickpick, any other number if want to guess: ");
        int choice = in.nextInt();
           if (choice ==0) {
               system = System.currentTimeMillis();
               guess = (int) sysTime % 100;
           }
        System.out.print("Enter your lottery pick (two digits): ");
         guess = in.nextInt();         //Lottery = 10 + random nextInt(10)
        in.close();

        int lotteryDigit1 = lottery / 10; //ex) 98 / 10 = 9 
        int lotteryDigit2 = lottery % 10; //ex) 98 % 10= 8 which is the remainder

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");

        else if (guessDigit1 == lotteryDigit2 
            && guessDigit2 == lotteryDigit1)
            System.out.println("Match all digits: you win $3,000");

        else if (guessDigit1 == lotteryDigit1 
            || guessDigit1 == lotteryDigit2
            || guessDigit2 == lotteryDigit1 
            || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");

        else
            System.out.println(lottery + ": Sorry, no match");
    }

}