import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //house price
        System.out.print("House price to K:");
        double price = input.nextDouble() + 1000;

        //down payment percentage 
        System.out.print("Percentage of downpayment:");
        double downpaymentPercentage = input.nextDouble();

        //mortgage terms (in years)
        System.out.print("Enter number of years:");
        double years = input.nextDouble();

        //Anual Interest Rate
        System.out.print("Enter annual interest rate:");
        double annualInterestRate = input.nextDouble();

        // Monthly interest rate
        double r = annualInterestRate / 12;

        // Loan principal 
        double p =price - downpaymentPercentage * price;

        // Number of payments 
        double n = years * 12; 
        double monthlyPayments;
        
           if (r > 0 ) {
        monthlyPayments = (r * p * Math.pow(1 + r, n)) /
                                 (Math.pow(1+ r, n));
        }   
           else {
               monthlyPayments = p / n;
           }                      
        System.out.print("Monthly payment: " + monthlyPayments);                  

        input.close();
    }


}