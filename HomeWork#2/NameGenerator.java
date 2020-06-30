/*
   Axel Montes Salazar
   306126956
   CS2011-05
 
   Computes random 4 letter names with the first lettter being capital
*/ 

public class NameGenerator {
    public static void main(String[] args) {

        //int upperBound = 'A' ;
        //int lowerBound = 'a' ;
         
        char firstCapitalLetter = (char) ('A' + Math.random() * ('Z' - 'A' + 1)) ; 
        char secondLowerLetter = (char) ('a' + Math.random() * ('z' - 'a' + 1)) ; 
        char thirdLowerLetter = (char) ('a' + Math.random() * ('z' - 'a' + 1)) ; 
        char fourthLowerLetter = (char) ('a' + Math.random() * ('z' - 'a' + 1)) ; 
       
        
        System.out.println( firstCapitalLetter + "" + secondLowerLetter + "" + thirdLowerLetter + "" + fourthLowerLetter );
        
    
    }
}