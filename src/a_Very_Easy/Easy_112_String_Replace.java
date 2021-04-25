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

public class Easy_112_String_Replace {

    public static void main(String[] args) {

        System.out.println(print("javascript is cool"));
    }

    static  String print(String str){


            return str.replace("a", "4")
                      .replace("e", "3")
                      .replace("i", "1")
                      .replace("o","0")
                      .replace("s","5");
        }
    }

    //   j4v45cr1pt 15 c00l
