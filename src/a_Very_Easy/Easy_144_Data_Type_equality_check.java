package a_Very_Easy;

/*
In this challenge, you must verify the equality of two different values given the parameters a and b.

Both the value and type of the parameters need to be equal. The possible types of the given parameters are:

Numbers
Strings
Booleans (false or true)
Special values: null
What have you learned so far that will permit you to do two different checks (value and type) with a single statement?

Implement a function that returns true if the parameters are equal, and false if they are not.

Examples
checkEquality(1, true) ➞ false
// A number and a boolean: the value and type are different.

checkEquality(0, "0") ➞ false
// A number and a string: the type is different.

checkEquality(1,  1) ➞ true
// A number and a number: the type and value are equal.
 */
public class Easy_144_Data_Type_equality_check {
    public static void main(String[] args) {

        System.out.println(print(1, "2"));
    }

    static  boolean print(Object a , Object b){


        return a!= null && a.equals(b);
    }

}



