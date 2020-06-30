/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Computes order in which dice are trow with random landing [1 to 6]
   Version: 1
*/
public class FiveDice{
    public static void main(String[] args) {
        // (char) ('A' + Math.random() * ('Z' - 'A' + 1))

        for (int count = 1 ; count <= 5; ) {                 
            
        String dice;
        switch (count) {
        case 1: 
            dice = "First";
            System.out.println(dice + " die is " + (int) (7 + Math.random() * (1 - 7 )) );
            ++count;
        case 2:
            dice = "Second";
            System.out.println(dice + " die is " + (int) (7 + Math.random() * (1 - 7 )) );
            ++count;
        case 3:
            dice = "Third";
            System.out.println(dice + " die is " + (int) (7 + Math.random() * (1 - 7 )) );
            ++count;
        case 4:
            dice = "Fourth";
            System.out.println(dice + " die is " + (int) (7 + Math.random() * (1 - 7 )) );
            ++count;
        case 5:
            dice = "Fifth";
            System.out.println(dice + " die is " + (int) (7 + Math.random() * (1 - 7 )) );
            ++count;   
            //Used the examples from Welcome20.java + Seasons.java + added my NameGenerator random variable and tweak it so it takes numbers instead of char
        }
        }//end for()
    }
}