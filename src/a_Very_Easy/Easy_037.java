package a_Very_Easy;

/*
Create a function that takes two strings as arguments and return either true or false depending on whether the total number of characters in the first string is equal to the total number of characters in the second string.

Examples
comp("AB", "CD") ➞ true
comp("ABC", "DE") ➞ false
comp("hello", "edabit") ➞ false
 */
public class Easy_037 {

    public static void main(String[] args) {

        System.out.println( print("AA" , "BBc"));
    }

    static boolean  print(String a, String b){


        return  a.length() == b.length() ? true: false;
    }

}
