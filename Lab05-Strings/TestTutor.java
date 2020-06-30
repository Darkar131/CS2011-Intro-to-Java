/*
   Axel Montes Salazar
   306126956
   CS2011-05 

   Computes random 4-letter generator and ask the user to type the replicate by matching
*/ 
import java.util.Scanner;
public class TestTutor {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Type the following: ");

        //Following StringTest.java code example ch4 and from my HW2, book reference 4.4.7 Comparing Strings
        char capLet = (char) ('A' + Math.random() * ('Z' - 'A' + 1)) ; 
        char lowLet1 = (char) ('a' + Math.random() * ('z' - 'a' + 1)) ; 
        char lowLet2 = (char) ('a' + Math.random() * ('z' - 'a' + 1)) ; 
        char lowLet3 = (char) ('a' + Math.random() * ('z' - 'a' + 1)) ; 
        System.out.println(capLet + "" + lowLet1 + "" + lowLet2 + "" + lowLet3);

        String rewrite = in.nextLine();
        String googleVerification = (capLet + "" + lowLet1 + "" + lowLet2 + "" + lowLet3);
       
            if (rewrite.equals(googleVerification) ) {
               System.out.println("Perfect just like google's verification");
            }
                else if (rewrite.equalsIgnoreCase(googleVerification)){
                  System.out.println("Almost correct, but watch out for case sensitive or space next time!");
                }    
                    else {
                    System.out.println("Wrong! You are not ready to hack NASA yet");
                    }
    }
}