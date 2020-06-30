/*
   Axel Montes Salazar
   306126956
   CS2011-05

   Gets the vowels and consonants of a string and counts them in seperated
  
*/
import java.util.Scanner;
public class vowelsAndConsonants{
    public static void main(String[] args) {
        String yarn = "teacup";

        System.out.println("Testing with String: " +  "'" + yarn + "'" + "\n" + "eau");
        printVowels(yarn);
        getNumVowels(yarn);

        System.out.println("tcp");
        printConsonants(yarn);
        getNumConsonants(yarn);

    }

    public static void printVowels(String strVowel) {
        System.out.println(getNumVowels(strVowel));
    } //displays all vowels of string strVowel

    /* public static void getVowels(String strVowel) {
        String vowels = "";
        for (int i = 0; i < strVowel.length(); i++) {
            char c = strVowel.charAt(i);
            if (isVowel(c) ) {
                vowels += c;
            }
        }
    } */
    public static int getNumVowels(String strVowel) { //other could use is byte or long and such
        int count = 0;
        for (int i = 0; i < strVowel.length(); i++) {
            if (strVowel.charAt(i) == 'a' || strVowel.charAt(i) == 'e' || strVowel.charAt(i) == 'i'
                || strVowel.charAt(i) == 'o' || strVowel.charAt(i) == 'u' || strVowel.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }//end getNumVowels

    /*
    public static boolean isVowel(char strVowwel) {
        return true;
    }*/

    public static void printConsonants(String strCon) {
        System.out.println(getNumConsonants(strCon));

    } // displays all consonants from String strCon
    public static int getNumConsonants(String strCon) {
        int count = 0;
        for (int j = 0; j < strCon.length(); j++) {
            /* I try tp use the array method but could not get it to work properly, so instead I took the longer route
            char[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's',
                                't', 'v', 'w', 'x', 'z'};                 
            if (strCon.charAt(consonant)) {
            */                  
            if (strCon.charAt(j) == 'b' || strCon.charAt(j) == 'c' || strCon.charAt(j) == 'd' || strCon.charAt(j) == 'f' 
                || strCon.charAt(j) == 'g' || strCon.charAt(j) == 'h' || strCon.charAt(j) == 'j' || strCon.charAt(j) == 'k'
                  || strCon.charAt(j) == 'l' || strCon.charAt(j) == 'm' || strCon.charAt(j) == 'n' || strCon.charAt(j) == 'p'
                    || strCon.charAt(j) == 'q' || strCon.charAt(j) == 'r' || strCon.charAt(j) == 's' || strCon.charAt(j) == 't'
                      || strCon.charAt(j) == 'v' || strCon.charAt(j) == 'w' || strCon.charAt(j) == 'x' || strCon.charAt(j) == 'z') {
            count++;
            } 
        }
        return count;  
    }
}// Overall this assignment was a bit more challenging and wasn't my cup of tea...
 //So I did it the way I could undertand the best but ofcourse removing some useful ones, will defenitly come back to this one.

                    