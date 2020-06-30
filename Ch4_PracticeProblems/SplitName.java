import java.util.Scanner;

public class SplitName{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please eneter a name: ");
        String name = in.nextLine();
        in.close();

        int index = name.indexOf(" ");
        System.out.println("Index: " + index);
           if (index < 0) {
               System.err.println("Name must be in form of \t first & last ");
               System.exit(1);
           }

        String firstName = name.substring(0, index);
        String lastName = name.substring(index).trim();  //trim()
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println(lastName.length()); 
    }
}