import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int dividend = in.nextInt();

        System.out.print("Enter a divisor: ");
        int divisor = in.nextInt();

           if (dividend % divisor == 0) {
               System.out.println("Yes, " + dividend + " will divide " + divisor + " ,");
           }
              else if  (dividend % divisor != 0) {
                  System.out.println("No, " + dividend + " will not divide " + divisor + " ,");
              }
                 else  {
                     System.out.println("WoW that's illegal, I'm telling the Math police");    //Dividing by 0 triggers the ArithmeticException 
                 }

        System.out.println(" FYI 0 is divisible by everthing!");
        System.out.println(" and Everthing is divisible by 1");

    in.close();
        
    }
}