import java.util.Scanner;

public class MethodExamples {

    public static void splitName(String name) {
        int index = name.indexOf(" ");
        if (index < 0) {
            System.err.println("Name must be in the form of \"first last\"");
            return;
        }

        String firstName = name.substring(0, index);
        String lastName = name.substring(index).trim();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    public static int factorial(int n) {
        if (n < 0)
            return -1;

        int factorial = 1;
        for (int i = 1; i <= n; ++i)
            factorial *= i;
        return factorial;
    }

    public static void main(String[] args) {

        splitName("John");
        splitName("John Doe");

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = in.nextInt();
        in.close();

        int f = factorial(n);
        if (f < 0)
            System.out.println("N must be at least 0.");
        else
            System.out.println("The factorial is " + f);
    }

}