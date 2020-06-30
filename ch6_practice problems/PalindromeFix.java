import java.util.Scanner;

public class PalindromeFix {

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = in.next();
        in.close();

        // Check all the prefixes, from the longest to the shortest
        String prefix = "";
        for (int i = 0; i < word.length(); ++i) {
            prefix = word.substring(0, word.length() - i);
            if (isPalindrome(prefix))
                break;
        }
        System.out.println("The longest palindrome prefix is: " + prefix);

        // Check all the suffixes, from the longest to the shortest
        String suffix = "";
        for (int i = 0; i < word.length(); ++i) {
            suffix = word.substring(i);
            if (isPalindrome(suffix))
                break;
        }
        System.out.println("The longest palindrome suffix is: " + suffix);
    }

}