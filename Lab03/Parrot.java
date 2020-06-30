import java.util.Scanner;

public class Parrot {
    public static void main(String[] args) {
        //New Scanner
        Scanner input = new Scanner(System.in); 
    
        //Prompt User with something 
        System.out.print("Type Something: ");      
        String callBack = input.nextLine();
    
        System.out.println(callBack);
    input.close();
    }
}