package a_Very_Easy;
/*
Take an array of integers (positive or negative or both) and return the sum of the absolute value of each element.

Examples
getAbsSum([2, -1, 4, 8, 10]) ➞ 25

getAbsSum([-3, -4, -10, -2, -3]) ➞ 22

getAbsSum([2, 4, 6, 8, 10]) ➞ 30

getAbsSum([-1]) ➞ 1
Notes
The term "absolute value" means to remove any negative sign in front of a number, and to think of all numbers as positive (or zero).
All the elements in the given array are integers.
 */

import java.util.Arrays;

public class Easy_123_Math_abs {

    public static void main(String[] args) {

        int [] arr = new int[]{-3,-4,-10,-2,-3};

        System.out.println(print(arr ));
    }

    static int print(int [] arr) {


        return Arrays.stream(arr).map(x -> Math.abs(x)).sum();
    }

}
