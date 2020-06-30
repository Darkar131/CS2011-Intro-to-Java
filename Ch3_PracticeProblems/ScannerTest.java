import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print Prompt to console
        System.out.print("Enter three tokens:");

        /*
        //Read three tokens
        int t1 = in.nextInt();
        double t2 = in.nextDouble();
        double t3 = in.nextDouble(); */

        //Read three tokens
        String t1 = in.next();
        String t2 = in.nextLine(); //nextline takes the rest of the line after the first input
        String t3 = in.next();

        //The output of what we got
        System.out.println("t1 is " + t1);
        System.out.println("t2 is " + t2);
        System.out.println("t3 is " + t3);
        //System.out.println("t1 + t2" + (t1 + t2)); 

    in.close();     
    }
}