/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Computes random dice rolls then puts it together in a generated number
*/

public class FiveDice2{
    public static void main(String[] args) {

        for (int count = 0; count < 1; ) { 
            int random1 = (int) (7 + Math.random() * (1 - 7 )) ;
            int random2 = (int) (7 + Math.random() * (1 - 7 )) ;
            int random3 = (int) (7 + Math.random() * (1 - 7 )) ;
            int random4 = (int) (7 + Math.random() * (1 - 7 )) ;
            int random5 = (int) (7 + Math.random() * (1 - 7 )) ;

            System.out.println("Dice rolled: " + 
                             random1 
                       +" "+ random2 
                       +" "+ random3
                       +" "+ random4
                       +" "+ random5 ); 
    
            System.out.println("Generated number: " +
                            random1 
                       +""+ random2 
                       +""+ random3 
                       +""+ random4
                       +""+ random5 );
            ++count;           
        }
    }
}

                       /* unnecessary, first few attempt 
                       (int) (7 + Math.random() * (1 - 7 ))
                       +" "+ (int) (7 + Math.random() * (1 - 7 ))
                       +" "+ (int) (7 + Math.random() * (1 - 7 ))
                       +" "+ (int) (7 + Math.random() * (1 - 7 ))
                       +" "+ (int) (7 + Math.random() * (1 - 7 )) ); 
                       */