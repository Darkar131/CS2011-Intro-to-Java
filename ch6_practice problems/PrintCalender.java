import java.util.Scanner;

public class PrintCalendar {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String getMonthName(int month) {
        switch (month) {
        case 1:
            return "Janunary";
        case 2:
            return "Feburary";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            return "Invalid Month";
        }
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        case 2:
            return isLeapYear(year) ? 29 : 28;
        default:
            System.err.println("Invalid month: " + month);
            return -1;
        }
    }

    // Total number of days from 1/1/1970 to 1/month/year
    public static int getTotalNumberOfDays(int year, int month) {
        int days = 0;
        for (int i = 1970; i < year; ++i)
            days += isLeapYear(i) ? 366 : 365;

        for (int i = 1; i < month; ++i)
            days += getNumberOfDaysInMonth(year, i);

        return days;
    }

    public static int getStartDay(int year, int month) {
        // 1/1/1970 is a Thursday
        return (4 + getTotalNumberOfDays(year, month)) % 7;
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("\t\t\t" + getMonthName(month) + " " + year);
        System.out.println("-------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
    }

    public static void printMonthBody(int year, int month) {
        int day = getStartDay(year, month);
        for (int i = 0; i < day; ++i)
            System.out.print(" \t");
        for (int i = 1; i <= getNumberOfDaysInMonth(year, month); ++i) {
            System.out.print(i + "\t");
            if ((day + i) % 7 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter year and month: ");
        int year = in.nextInt();
        int month = in.nextInt();
        in.close();

        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

}