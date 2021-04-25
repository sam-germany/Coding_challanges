package a_Very_Easy;
/*
Write a function that calculates the factorial of a number recursively.

Examples
factorial(5) ➞ 120
factorial(3) ➞ 6
factorial(1) ➞ 1
factorial(0) ➞ 1
 */

public class Easy_113_Recursion_Factorials {

    public static void main(String[] args) {

        System.out.println(print(5));
    }                                          // flow   5 * 4 * 3 * 2 * 1

    static  int print(int num){

        if(num <= 1 ) return num;             // Here we can not put   if(num <= 0 ) return num;
                                              // because if we let pass  "num = 1"  then   it become
        return   num * print(num -1);         //   num * print(1 -1);    <-- it means we are multiplying with
                                             // zero, and anything multiply with zero will remain zero
        }                                    // so if we let passing  "num=1"  then we will get  zero as output
    }

