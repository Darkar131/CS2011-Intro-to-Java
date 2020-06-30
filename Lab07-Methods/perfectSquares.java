/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Gets user to enter to enter a range then computes the square toot of the numbers possible
*/
import java.util.*;

public class perfectSquares {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter range: ");
        int begin = in.nextInt();
        int end = in.nextInt();
        in.close(); 
        
        printSquaresInRange(begin, end);
       
    }
    public static int isPerfectSquare(int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter range: ");
        int begin = in.nextInt();
        int end = in.nextInt();
        in.close(); 

        for (int i = begin; i < end; i++) {
            int number = i;

        int sqr = (int) Math.sqrt(number);  //takes the input and gives back the square root
            if (sqr * sqr == number);  
        }  
        
        return -1;
            
    }// had issues with returning the square root.
    public static void printSquaresInRange(int begin, int end) {
        //something something small to big 
        int n = 0;
        if (begin < end) {
           isPerfectSquare(n);
        }
            else if (begin > end) {
                System.out.println("Invalid range, try from small to big.");
            }
    }
}