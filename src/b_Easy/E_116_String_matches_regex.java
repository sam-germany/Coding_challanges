package b_Easy;

/*
Create a method that accepts a string and returns true if it's in the format of a
proper phone number and false if it's not. Assume any number
 between 0-9 (in the appropriate spots) will produce a valid phone number.

This is what a valid phone number looks like:

(123) 456-7890
Examples
isValidPhoneNumber("(123) 456-7890") ➞ true
isValidPhoneNumber("1111)555 2345") ➞ false
isValidPhoneNumber("098) 123 4567") ➞ false
Notes
Don't forget the space after the closing parentheses.
 */
public class E_116_String_matches_regex {

    public static void main(String[] args) {

        System.out.println(print("(123) 456-7890"));
    }

    static  boolean print(String str){

        return str.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    }
}
/*
\\d      <-- means  digit , it means numeric value

\\s     <-- it means a String, as we do not have any String their but a empty space is their so need to put \\s
            otherwise it will give a error, check with or without  \\s

 */
