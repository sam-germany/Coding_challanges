package a_Very_Easy;
/*
Create a function that takes a number (from 1 - 60) and returns a corresponding string of hyphens.

Examples
Go(1) ➞ "-"
Go(5) ➞ "-----"
Go(3) ➞ "---"

Notes
You will be provided integers ranging from 1 to 60.
 */

public class Easy_091_Recursion {

    public static void main(String[] args) {

        System.out.println(print(5));
    }

    static  String print(int a){

        if(a <=1) return "-";

        return  1 + print(a-1);      // or     return "-" + print(a-1);
    }
}
/*
just for understanding i put    "return 1 + print(a-1);"

in this case on every iteration   1 + "1"      so at end  result   "1111-"
 */



