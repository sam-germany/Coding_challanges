package a_Very_Easy;

/*
Create a function that returns true if an input string contains only uppercase or only lowercase letters.

Examples
sameCase("hello") ➞ true
sameCase("HELLO") ➞ true
sameCase("Hello") ➞ false
sameCase("ketcHUp") ➞ false
 */

public class Easy_130_upper_lowerCase {

    public static void main(String[] args) {

        System.out.println(print("abcD"));
    }

    static  boolean print(String str){

        return  str.toUpperCase().equals(str) || str.toLowerCase().equals(str);
    }
}
