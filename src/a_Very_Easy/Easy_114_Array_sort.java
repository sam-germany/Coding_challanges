package a_Very_Easy;
/*
Create a function that takes an array of hurdle heights and a jumper's jump height, and determine whether or not the hurdler can clear all the hurdles.

A hurdler can clear a hurdle if their jump height is greater than or equal to the hurdle height.

Examples
hurdleJump([1, 2, 3, 4, 5], 5) ➞ true
hurdleJump([5, 5, 3, 4, 5], 3) ➞ false
hurdleJump([5, 4, 5, 6], 10) ➞ true
hurdleJump([1, 2, 1], 1) ➞ false
 */

import java.util.Arrays;

public class Easy_114_Array_sort {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(print(arr, 4));
    }

    static boolean print(int [] arr, int a){

        Arrays.sort(arr);

        if(a >= arr[arr.length -1]) return true;

        return false;
        }
    }

