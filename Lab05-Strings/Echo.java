/*
   Axel Montes Salazar
   306126956
   CS2011-05 

   Computes user input and outputs the echo of it
*/ 
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Type in one or more words: ");
        String mmmWhatYouSayyy= in.nextLine(); //imogen heap- hide& seek (Official Video)- great song while doing the echo assignment
        char echo = mmmWhatYouSayyy.charAt(0);

            if (mmmWhatYouSayyy.length() >= 3) {

                System.out.println(mmmWhatYouSayyy.toUpperCase().trim() );

                String lastThree = mmmWhatYouSayyy.substring(mmmWhatYouSayyy.length() - 3);
                System.out.println(lastThree.toUpperCase().trim() );
                System.out.println(lastThree.toLowerCase().trim() );

                String lastTwo = mmmWhatYouSayyy.substring(mmmWhatYouSayyy.length() - 2);
                System.out.println(lastTwo.toLowerCase().trim() );

                String lastOne = mmmWhatYouSayyy.substring(mmmWhatYouSayyy.length() - 1);
                System.out.println(lastOne.toLowerCase().trim() ) ;
            }   
                else { 
                    System.out.println("Your entry must be at least 3 characters long \n and the last three characters must be letters");

                }
    }
}