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
public class E_053_StringBuilder_reverse_compare {

    public static void main(String[] args) {

        System.out.println(print("reviver"));
    }

    static  boolean print(String str){      // both cases work fine

        return  new StringBuilder(str).reverse().toString().equals(str);

  //      return  str.equals(new StringBuilder(str).reverse().toString());

    }
}

