import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String args[]) {

        Random random = new Random(); //if you put a see inside random(1) you will get same sequence
        int n1 = random.nextInt(10);  //random number not including 10
        int n2 = random.nextInt(100);

        Scanner in = new Scanner(System.in);
        System.out.print(n1 + " + " + n2 + " = ");
        int sum = in.nextInt();

        String msg;
           if (n1 + n2 ==sum) {
               msg = "correct";
           }
              else {
                  msg = "incorrect";
              }

        System.out.println(n1 + " + " + n2 + " = " + sum + " is " + msg);

        in.close();
        
    }
}