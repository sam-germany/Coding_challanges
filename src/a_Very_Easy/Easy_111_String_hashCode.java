package a_Very_Easy;
/*
Create a function that returns the smaller number.

Examples
smallerNum("21", "44") ➞ "21"
smallerNum("1500", "1") ➞ "1"
smallerNum("5", "5") ➞ "5"

Notes
Numbers will be represented as strings, and your output should also be a string.
If both numbers tie, return either number.
Numbers will be positive.
Bonus: See if you can do this without converting to integers.
 */

public class Easy_111_String_hashCode {

    public static void main(String[] args) {

        System.out.println(print("5", "10"));
    }

    static  String print(String a, String b){

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

            return  (a.hashCode() <= b.hashCode()) ? a : b;
        }
    }
