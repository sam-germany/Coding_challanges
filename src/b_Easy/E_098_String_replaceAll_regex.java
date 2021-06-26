package b_Easy;
/*
A palindrome is a word, phrase, number or other sequence of characters which reads the same
backward or forward, such as madam or kayak.

Write a function that takes a string and determines whether it's a palindrome or not.
The function should return a boolean (true or false value).

Examples
isPalindrome("Neuquen") ➞ true
isPalindrome("Not a palindrome") ➞ false
isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!") ➞ true

Notes
Should be case insensitive.
Special characters (punctuation or spaces) should be ignored.
 */
public class E_098_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
    }

    static boolean print(String str){

         str = str.toLowerCase().replaceAll("[^a-z]","");


        return  str.equals(new StringBuilder(str).reverse().toString());

    }
}

