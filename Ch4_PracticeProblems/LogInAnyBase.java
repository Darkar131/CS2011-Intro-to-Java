import java.util.Scanner;

public class LogInAnyBase {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = in.nextDouble();
        
        System.out.print("Enter log base: ");
        double base = in.nextDouble();
        
		System.out.print("Log base " + base + " of " + num + " is: " + 
            Math.log(num) / Math.log(base));
            

	in.close();
	}
}