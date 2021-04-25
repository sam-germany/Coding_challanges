package a_Very_Easy;
/*
Create a function that takes a character and a string as arguments and returns the number of times the character is found in the string.

Examples
charCount('a', "edabit") ➞ 1
charCount('c', "Chamber of secrets") ➞ 1
charCount('b', "big fat bubble") ➞ 4
Notes
Your output must be case-sensitive (see second example).
 */

public class Easy_120_String_char {

    public static void main(String[] args) {


        System.out.println(print('a', "abcdef aa" ));
    }

    static int print(char c, String str){


        return (int) str.chars().filter( x -> x == c).count() ;
        }
    }

