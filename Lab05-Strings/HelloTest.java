import java.util.Scanner;

public class HelloTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name; ");
        String enterName = in.nextLine();
        String interrupt = "Hello ".substring(0);
        //String empty = enterName.charAt(" ").lastIndexOf(interrupt);

        System.out.println(interrupt + "" + enterName);


        
    }
}