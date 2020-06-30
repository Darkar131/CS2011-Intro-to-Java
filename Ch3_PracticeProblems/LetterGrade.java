import java.util.Scanner;

public class LetterGrade {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a score (0-100): ");
        int score = in.nextInt();

           if (score >= 90) {
               System.out.println("A");
             }
               else if (score >= 80) {
                   System.out.println("B");
               }
                  else if (score >= 70) {
                      System.out.println("C");
                  }
                     else if (score >= 60) {
                         System.out.println("D");
                     }
                        else System.out.println("F");

    in.close();                    
        
    }
}