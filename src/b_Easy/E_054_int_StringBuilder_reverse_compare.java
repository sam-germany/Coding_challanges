package b_Easy;

/*
A palindrome is a word that is identical forward and backwards.

mom
racecar
kayak
Given a word, create a function that checks whether it is a palindrome.

Examples
checkPalindrome("mom") ➞ true
checkPalindrome("scary") ➞ false
checkPalindrome("reviver") ➞ true
checkPalindrome("stressed") ➞ false

Notes
All test input is lower cased.
 */
public class E_054_int_StringBuilder_reverse_compare {

    public static void main(String[] args) {

        System.out.println(print(7227));
    }

    static  boolean print(int a){      // both cases work fine

         String val =  String.valueOf(a);

         return  new StringBuilder(val).reverse().toString().equals(val);

    }
}

