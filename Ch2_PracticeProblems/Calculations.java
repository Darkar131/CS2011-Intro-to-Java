

public class Calculations {
    public static void main(String[] args) {
        // System.out.println(5 / 2 * 2);
        // System.out.println(2 * 5 / 2);

        // System.out.println(1 + 2 * 3 + 4 * 5 % 6 - 7);

        int a = 1, b = 1;
        int c1 = 10 + ++a * 10;
        int c2 = 10 + b++ * 10; // ignore
        // after its calculated

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c1 is " + c1);
        System.out.println("c2 is " + c2);

        a = b = 1;
        c1 = 10 + --a * 10;
        c2 = 10 + b-- * 10;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        // System.out.println("c1 is " + c1);
        // System.out.println("c2 is " + c2);

        // System.out.println(Math.pow(2,3));
        // System.out.println(Math.pow(3,2))

    }
}