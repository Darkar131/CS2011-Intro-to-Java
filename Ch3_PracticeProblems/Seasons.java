import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a month (1-12): ");
        int month = in.nextInt(); //use next only to get strings instead of numbers
        in.close();

        String season = "";

        switch (month) {
        case 1:
        case 2:
        case 12:
            season = "Winter";
            break;

        case 3:
        case 4: season = "My Birthday in the ";
        case 5:
            season = "Spring";
            break;

        case 6:
        case 7:
        case 8:
            season = "Summer";
            break;

        case 9:
        case 10:
        case 11:
            season = "Fall";
            break;

        default:
            season = "Invalid Input";
        }

        System.out.println(season);

    }

}