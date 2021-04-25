package b_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

Sort integer array in ascending order.
If the function's argument is null, an empty array, or undefined; return an empty array.
Return a new array of sorted numbers.

Examples
sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]
sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]
sortNumsAscending(null) ➞ []
sortNumsAscending([]) ➞ []

Notes
Test input can be positive or negative.
 */
public class E_023_Array_sort {

    public static void main(String[] args) {

        int[] arr  = new int[] {1,2,10,-1,5};

         int [] arr2 = print(arr);

         for(int x : arr2) {
             System.out.println(x);
         }
    }

    static  int [] print( int [] arr){

        if(arr == null) return new int[]{};
        Arrays.sort(arr);

         return arr;
    }
}

