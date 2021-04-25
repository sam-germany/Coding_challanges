package a_Very_Easy;

/*
Create a method that takes an array of integers. Return the largest integer in the array.

Examples
findLargestNum([4, 5, 1, 3]) ➞ 5

findLargestNum([300, 200, 600, 150]) ➞ 600

findLargestNum([1000, 1001, 857, 1]) ➞ 1001

Notes
Expect either a positive number or zero (there are no negative numbers).
 */

import java.util.Arrays;

public class Easy_131_Array_max_value {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(print(arr));   // with Streams
        System.out.println(print2(arr));   // without Streams
    }

    static  int print(int [] arr){

        return Arrays.stream(arr).max().getAsInt();
    }

    static  int print2(int [] arr){

        int largest = 0;

        for(int x : arr){

            if(largest < x)   largest = x;

        }
        return largest;
    }

}
