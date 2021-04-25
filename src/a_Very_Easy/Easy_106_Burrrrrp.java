package a_Very_Easy;

/*
Create a function that returns the string "Burp" with the amount of "r's" determined by the input parameters of the function.

Examples
longBurp(3) ➞ "Burrrp"
longBurp(5) ➞ "Burrrrrp"
longBurp(9) ➞ "Burrrrrrrrrp"

Notes
Expect num to always be >= 1.
 */

public class Easy_106_Burrrrrp {

    public static void main(String[] args) {


         System.out.println(print(5));
    }

    static String print(int a){

        String prefix = "Bu";
        String suffix = "p";

        String add = "";

        while(add.length() < a){
            add +="r";
        }

       return  prefix+ add+ suffix;
    }
}


