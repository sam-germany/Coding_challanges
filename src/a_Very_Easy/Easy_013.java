package a_Very_Easy;/*
Java has a logical operator &&. The && operator takes two boolean values, and returns true if both values are true.

Consider a && b:

    a is checked if it is true or false.
    If a is false, false is returned.
    b is checked if it is true or false.
    If b is false, false is returned.
    Otherwise, true is returned (as both a and b are therefore true ).

The && operator will only return true for true && true.

Make a function using the && operator.
Examples

and(true, false) ➞ false
and(true, true) ➞ true
and(false, true) ➞ false
and(false, false) ➞ false
 */

public class Easy_013 {

    public static void main(String[] args) {


        System.out.println(print( false,false ));
    }

    static  boolean print(boolean a, boolean b){

     //   boolean c =   a == true && b == false ? false: true;


        return   a & b;

    }
}
