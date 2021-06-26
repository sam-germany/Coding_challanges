package b_Easy;
/*
Write a function that takes a credit card number and only displays the last four characters.
The rest of the card number must be replaced by ************.

Examples
cardHide("1234123456785678") ➞ "************5678"
cardHide("8754456321113213") ➞ "************3213"
cardHide("35123413355523") ➞ "**********5523"

Examples
Ensure you return a string.
The length of the string must remain the same as the input.
 */
public class E_085_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("3331233389"));
    }


    static String print_2(String str) {

        String lastDigits = str.substring(str.length() - 4);

        str = str.substring(0, str.length() - 4).replaceAll("[0-9]", "*");

        return str + lastDigits;
    }

    static  String print(String str){       // shortcut way with  "regex"

        return str.replaceAll(".(?=.{4})", "*");
    }}
/*
 .     Matches any character



 */
