import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
         
           if ((a > b) && (a > c)) {
               System.out.println("max: " + a);
           }
              else if ((b > a) && (b > c)) {
                  System.out.println("max: " + b);
              }
                 else if ((c > a) && (c > b)) {
                     System.out.println("max: " + c);
                 }

    in.close();    
    }
}


/* Midterm 
1.) Use only 2 comparison 
2.) use aux variable 

*/