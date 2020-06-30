import java.util.Scanner;

public class IntToByte {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
          
          int theIntegerInput = input.nextInt();    
        System.out.println("int value: " + theIntegerInput);

          theIntegerInput = (byte) theIntegerInput;
        System.out.println("byte value: " + theIntegerInput); 

    input.close();
    }
}