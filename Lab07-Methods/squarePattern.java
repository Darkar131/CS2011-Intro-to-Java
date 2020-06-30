/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Gets user to enter to enter a range then computes the square toot of the numbers possible
*/
import java.util.*; 
  
public class squarePattern {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer and a character: ");
        int number = in.nextInt();
        char character = in.next().charAt(0);
        in.close();

        displayPattern(number, character);  
    }
    public static void displayPattern(int number, char character) {
        
        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                System.out.print(character + " ");
            }    
        System.out.print("\n");    
        }   
    }
}
