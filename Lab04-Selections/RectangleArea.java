import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rectangle width and height: ");

        double width = in.nextDouble();
        double height = in.nextDouble();
    
        double area = width * height;
           if (area <= 0) {
               System.out.println("Input is Invalid");
           }
           else {
               System.out.println("The area is " + area);
           }
    in.close();    
    }
}