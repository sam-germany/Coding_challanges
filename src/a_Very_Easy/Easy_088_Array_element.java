package a_Very_Easy;
/*
Write a function to check if an array contains a particular number.

Examples
check([1, 2, 3, 4, 5], 3) ➞ true
check([1, 1, 2, 1, 1], 3) ➞ false
check([5, 5, 5, 6], 5) ➞ true
check([], 5) ➞ false
 */

import java.util.Arrays;

public class Easy_088_Array_element {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2 , 3, 4};

        System.out.println(print(arr, 10));
    }

    static  boolean print(int [] arr, int a){

      return Arrays.stream(arr).anyMatch( x -> x == a);
        }
    }

