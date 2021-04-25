package a_Very_Easy;

/*
Create a function that takes a base number and an exponent number and returns the calculation.

Examples
calculateExponent(5, 5) ➞ 3125
calculateExponent(10, 10) ➞ 10000000000
calculateExponent(3, 3) ➞ 27

Notes
All test inputs will be positive integers.
 */
public class Easy_068 {

    public static void main(String[] args) {

        System.out.println(print(5,5));
    }

    static int print(int a, int b) {

        return  (int)Math.pow(a,b);
    }
}
