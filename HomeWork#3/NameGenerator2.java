/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Generates random numbers depending how many dice you want to roll from a 6 face dice
*/
import java.util.Scanner; 
public class NameGenerator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name length: ");
        int enter = in.nextInt();

        boolean vowel = true;
        for (char ch = 0; ;ch++) {
        switch (ch) {
	    case 'A' :
	    case 'E' :
	    case 'I' :
	    case 'O' :
        case 'U' :
        vowel = true;
	    }
        if(enter <= 0) {
            System.out.println("The length must be at least 1"); //if length is not equal to 1 or more then trigger this if-statement
        } 
            if (vowel) {
                System.out.print( (char) ('A' + Math.random() * ('Z' - 'A' + 1)) ); //First letter will be upper case

                for(int i = 1; i < enter; i++){
                    System.out.print( (char) ('a' + Math.random() * ('z' - 'a' + 1)) ); //Anything after it, will become lower case
                } 
            }
        }//end first for loop   
    }
}

   