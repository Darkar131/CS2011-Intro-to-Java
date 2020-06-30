import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner predictor = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = predictor.nextInt();

        //see if its leap year
        String msg = "leap year";
           if ((year%4==0) && !(year%100==0) || (year%400==0)); {
            msg = " is " + msg;
        }
           else {
          msg = " is not " + msg;
        }
        //Display result
        System.out.println(year + msg);

        predictor.close();
        
    }
}