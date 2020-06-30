import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {

        Random random = new Random();
        int coinTossing = random.nextInt(2);

        int throwCoin = coinTossing / 2;

           if (coinTossing == throwCoin) {
               System.out.println("You got Heads");
           }
           else {
               System.out.println("You got Tails");
           }

        
    }
}