/*
   Axel Montes Salazar
   306126956
   CS2011-05
 
   Prints numbers from 1 to 100 but gives a "Foo" message if divisible by 3 and a "Bar" message if divisible by 5 
*/
public class FooBar{
    public static void main(String[] args) {
        for (int i = 7; i < 63; i++) {
            if (i % 2 != 0 /*&& i % 5 != 0 */) { 
              System.out.println(i);       //Prints all numbers except the ones that are divisible by 3 and 5
            }
                if (i % 2 ==0){
                    System.out.println(""); //Prints Foo if divisible by 3
                }
                /*
                    if (i % 5 ==0) {
                        System.out.println(""); //Prints Far if divisible by 5
                    }
                    */
		}
        
    }
}