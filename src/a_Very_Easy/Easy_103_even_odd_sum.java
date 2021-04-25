package a_Very_Easy;

/*
Create a function that returns the minimum number of removals to make the sum of all elements in an array even.

Examples
minimumRemovals([1, 2, 3, 4, 5]) ➞ 1
minimumRemovals([5, 7, 9, 11]) ➞ 0
minimumRemovals([5, 7, 9, 12]) ➞ 1

Notes
If the sum is already even, return 0 (see example #2).
The output will be either 0 or 1.
 */

import java.util.Arrays;

public class Easy_103_even_odd_sum {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(print(arr));
    }

    static int  print(int [] arr){

      int x = Arrays.stream(arr).sum();

      if(x%2 ==0){
          return 0;
      } else
          return 1;
    }
}


