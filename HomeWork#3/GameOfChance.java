
import java.util.Scanner;
public class GameOfChance{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome human being, you think you got what it takes" + "\n" +
                         "to defeat an A.I? well to bad because I'm the best A.I there is...");

        System.out.println();
        System.out.println("Press 'Enter' whenever you are" + "\n" +
                         "ready to roll the virtual die.");
                
        System.out.println();                 
        System.out.println("\t" + "\t" + "S C O R E" + "\n" +
                            "\t" + "\t" + "A.I : you" + "\n" +
                            "\t" + "\t" + " 0     0");  
        String pressEnter = in.nextLine();   
        //int totalHumanScore = 0;
        //int totalAIScore =0;
       
        for (int round = 1; round <= 5; round++) { //total of rounds is 5
            int aiRoll = (int) (7 + Math.random() * (1 - 7 )); 
            int humanRoll = (int) (7 + Math.random() * (1 - 7 )); //random numbers from 1 to 6

            System.out.println("----------------------------------------");
            System.out.println("\t" + "\t" + "Round " + round); //round begins and goes to next round
            System.out.println("A.I rolls: " + aiRoll);

            
            System.out.print("Your turn: (press 'Enter') ");
            String reroll = in.nextLine();
            System.out.print(reroll);
            System.out.println(humanRoll);

            int storePoints = aiRoll + humanRoll;
            int humanPoints = storePoints;
                                            //not sure how to store the points gain from one round and carry them to the next
            int aiPoints = storePoints;

                if (humanRoll > aiRoll) {       
                  System.out.println("this time the points are yours, but don't get to cocky yet!");

                  System.out.println("\t" + "\t" + 
                                     "S C O R E" + "\n" +
                        "\t" + "\t" + "A.I : you" + "\n" +
                         "\t" + "\t" + "0" + "       " + humanPoints); 
                }

                if (aiRoll > humanRoll){
                    System.out.println("haha you are pathetic human, I'm fabulous. Praise me");
                    System.out.println("\t" + "\t" + 
                                       "S C O R E" + "\n" +
                          "\t" + "\t" + "A.I : you" + "\n" +
                          "\t" + "\t" + aiPoints + "     " + "0"); 
                }
                if (humanRoll == aiRoll) {
                    int losePoints = -10;
                    System.out.println("what? we are both getting punish for your pathetic roll");
                    System.out.println("\t" + "\t" + 
                                       "S C O R E" + "\n" +
                          "\t" + "\t" + "A.I : you" + "\n" +
                    "\t" + "\t" + (losePoints + aiPoints) + "     " + (losePoints + humanPoints) );

                }
            System.out.print("Okay");    
            String okay = in.nextLine();

            /* Code was intended to use but could not get it to work without first storing the added points in which I had trouble and left it the way it is, but I tried.
            for (int rounds = 6; rounds >= 5; rounds++) 
                System.out.println(" ");    
                System.out.println("\t" + "\t" + 
                "F I N A L    S C O R E" + "\n" +
                "\t" + "\t" + "A.I : you" + "\n" +
                "\t" + "\t" +  "");
                    if (human > ai) {
                        System.out.println("sniff snif.. huh? its nothing my CPU is just overheating.. bakkaa");
                    }
                        else if (human > ai) {
                            System.out.println("haha, I told you don't stand a chance human");
                        } 
                            else if (human == ai) {
                                System.out.println("unfortunately I cannot accept this tie human, So I'll kill you instead")
                            }        
           */

        }//end first for loop
        System.out.println();
        System.out.println( "\t" + "G A M E   O V E R");
        System.out.println( "You lost to a inferior species either way. Therefore a unfair match that resulted in your death...");
     
    }//end static void
} //end public class