import java.util.Scanner;

public class RotatePoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x- and y-coordinate: ");
        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.print("Enter angle of rotation in degrees: ");
        double degrees = in.nextDouble();

        System.out.print("Enter + for counter-clockwise \n or - for clockwise rotation: ");
        char clockwise = in.next().charAt(0);
 
        //Note: 4.2.1 Book + Fomulas from HW2
        double x1 = (x * Math.cos(Math.PI/ degrees) - y * Math.sin(Math.PI/ degrees) ) ;
        double y1 = (x * Math.sin(Math.PI/ degrees) + y * Math.cos(Math.PI/ degrees) ) ;
        //double x1 = Math.toRadians(x);
        //double y1 = Math.toRadians(y);
        char clockwiseEitherOr = '+' ;
        char clockwiseEitherOr2 = '-' ;
    
           if ( (clockwise == clockwiseEitherOr) || (clockwise == clockwiseEitherOr2)) { //Use Rounding ex.) Math.Round()
               System.out.println("New coordinates are (" + x1 + " , " + y1 + ")" ) ;
           }
              else {
                     System.out.println("Invalid input: " + clockwise) ;
                 }

    in.close();   
    }

}
