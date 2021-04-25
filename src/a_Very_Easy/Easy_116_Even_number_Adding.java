package a_Very_Easy;
/*
Create a function that takes two parameters (start, stop), and returns the sum of all even numbers in the range.

Examples
sumEvenNumsInRange(10, 20) ➞ 90
// 10, 12, 14, 16, 18, 20

sumEvenNumsInRange(51, 150) ➞ 5050

sumEvenNumsInRange(63, 97) ➞ 1360
Notes
Remember that the start and stop values are inclusive.
 */

import java.util.stream.IntStream;

public class Easy_116_Even_number_Adding {

    public static void main(String[] args) {

        System.out.println(print(10, 20));
    }

    static int print( int a, int b){


        return    IntStream.rangeClosed(a,b).filter( x -> x %2==0).sum();
        }
    }

