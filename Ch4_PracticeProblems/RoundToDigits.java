import java.util.Scanner;

public class RoundToDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = in.nextDouble();
        num = Math.rint(num + 100) / 100;
        System.out.println("Rounded: " + num);


     in.close();   
    }
}