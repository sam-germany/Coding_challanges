package a_Very_Easy;
/*
You will be given an array, showing how far James travels away from his home for each day. He may choose to travel towards or away from his house, so negative values are to be expected.

Create a function which calculates how far James must walk to get back home.

Examples
distanceHome([2, 4, 2, 5]) ➞ 13
distanceHome([-1, -4, -3, -2]) ➞ 10
distanceHome([3, 4, -5, -2]) ➞ 0

Notes
Assume that James only travels in a straight line.
Distance is always a positive number..
 */

import java.util.Arrays;

public class Easy_086_Math_abs {

    public static void main(String[] args) {

        int[] arr = new int[]{-1,-4,-3,-2};

        System.out.println(print(arr));
    }

    static  int print(int [] arr){

      return   Arrays.stream(arr).sum();

 //     return   Math.abs(Arrays.stream(arr).sum());
        }
    }

// Note:  Math.abs()     convert    -10   into    +10

