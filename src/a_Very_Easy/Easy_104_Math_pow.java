package a_Very_Easy;

/*
Create a function that takes in an array of numbers and returns the sum of its cubes.

Examples
sumOfCubes([1, 5, 9]) ➞ 855
// Since 1^3 + 5^3 + 9^3 = 1 + 125 + 729 = 855

sumOfCubes([3, 4, 5]) ➞ 216
sumOfCubes([2]) ➞ 8
sumOfCubes([]) ➞ 0

Notes
If given an empty array, return 0.
 */

import java.util.Arrays;

public class Easy_104_Math_pow {

    public static void main(String[] args) {

        int[] arr = new int[]{1,5,9};

        System.out.println(print(arr));
    }

    static int print(int [] arr){

      int  result = Arrays.stream(arr).map( x -> {
                           int y =  (int) Math.pow(x,3);
                           return y;
                          }).sum();

       return  result;
    }
}


