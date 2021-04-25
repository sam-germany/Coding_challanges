package b_Easy;

import java.util.Arrays;

/*
Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
 */
public class E_012_Diff_min_max_Array {

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,15,2,4};

        System.out.println(print(arr));
    }

    static int print(int [] arr){

        Arrays.sort(arr);


        return  arr[0] + arr[arr.length -1];
    }


}

