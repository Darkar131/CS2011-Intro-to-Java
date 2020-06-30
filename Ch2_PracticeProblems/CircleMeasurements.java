

import java.util.Scanner;

public class CircleMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius:");

        double radius; input.nextDouble();
        radius = 6.5;

        final double PI = 3.14159;      

        System.out.println("Diameter is " + radius * 2);
        System.out.println("Perimeter is " + 2 * PI * radius);
        System.out.println("Area is " + PI * radius * radius);

        input.close();
    }
}