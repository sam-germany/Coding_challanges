package b_Easy;
/*
In semantic versioning a piece of software can be represented in a format like this example: 6.1.9.

The first number is the major version.
The second number is the minor version.
The third number is the patch (bug fixes).
Write three separate functions, one to retrieve each element in the semantic versioning specification.

Examples
// 6.1.9
retrieveMajor("6.1.9") ➞ "6"
retrieveMinor("6.1.9") ➞ "1"
retrievePatch("6.1.9") ➞ "9"

// 2.1.0
retrieveMajor("2.1.0") ➞ "2"
retrieveMinor("2.1.0") ➞ "1"
retrievePatch("2.1.0") ➞ "0"
 */
public class E_060_String_split_SpecialCharacters {
    public static void main(String[] args) {
        System.out.println(case_1("6.1.9"));
    }

    static  String case_1(String str){
       return   str.split("\\.")[0];   // as we have  . (dot) as a special character, so we need to use as explained
    }                                        // below before it    \\  (backslash)    or it inside      []  (square brackets)

    static  String case_2(String str){
        return   str.split("\\.")[1];
    }

    static  String case_3(String str){
        return   str.split("\\.")[2];
    }
}
/*
Split using  "\\"
----------------
Note: There are 12 such characters in regex. These are: \, ^, $, ., |, ?, *, +, (, ), [, {.
       You can see their meaning in regex here.
If we want to split a String at one of these characters, special care has to be taken to
escape these characters in the method parameters. One way we can use this is to use a backslash \

Split using  "[]"
-----------------
Note: There are 12 such characters in regex. These are: \, ^, $, ., |, ?, *, +, (, ), [, {.
       You can see their meaning in regex here.

if we put these special characters inside the  "[]"   square brackets. then we can also split it.
 */

