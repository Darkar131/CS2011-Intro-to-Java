import java.util.Scanner;

public class Palindrome {

    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        String s = in.next();
        in.close();

        boolean isPalindrome = true;
        for( int i = 0; i < s.length() / 2; ++i )
            if( s.charAt( i ) != s.charAt( s.length() - 1 - i ) )
               
            {
                isPalindrome = false;
                break;
            }

        System.out.println( s + " is palindrome: " + isPalindrome );

    }

}