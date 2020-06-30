/*
   Axel Montes Salazar
   306126956
   CS2011-05 

   Validates whether any phone number input is correct
*/
import java.util.Scanner;

public class PhoneValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                                              //01234567891123 
        System.out.print("Enter phone number as (###) ###-#### : ");
        String phoneNum = in.nextLine();
        //char number = phoneNum.charAt(0);

           if (phoneNum.length() == 14){
               String firstSet =  phoneNum.substring(1, 4);
               String secondSet = phoneNum.substring(6, 9);
               String thirdSet = phoneNum.substring(10, 13);
               
               //Found another way using boolean expression and works since it first ask me that strings cannot convert to boolean and gave it a try
               //boolean firstSetValidation = phoneNum.substring(0) == "(";  
               //boolean secondSetValidation = phoneNum.substring(4, 5) == ") "; 
               //boolean thirdSetValidation = phoneNum.substring(9) == "-";
               char convert = phoneNum.charAt(0);
               int firstSetValidation = phoneNum.substring(0).indexOf('('); 
               int secondSetValidation = phoneNum.substring(4).indexOf(')');
               int secondSetPart2Validation = phoneNum.substring(5).indexOf(' ');
               int thirdSetValidation = phoneNum.substring(9).indexOf('-');

               System.out.println("Thank You, now I'll stock this person");
               
            }
               else {
                  System.out.println("Error: wrong phone number format");
              }

        
    }
}