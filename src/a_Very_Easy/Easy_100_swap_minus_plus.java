package a_Very_Easy;

import java.util.Arrays;

/*
A number added with its additive inverse equals zero. Create a function that returns an array of additive inverses.

Examples
additiveInverse([5, -7, 8, 3]) ➞ [-5, 7, -8, -3]
additiveInverse([1, 1, 1, 1, 1]) ➞ [-1, -1, -1, -1, -1]
additiveInverse([-5, -25, 35]) ➞ [5, 25, -35]
 */

public class Easy_100_swap_minus_plus {

    public static void main(String[] args) {

        int[] arr = new int[]{5,-7,8,3};

        int [] arr2 = print(arr);

        Arrays.stream(arr2).forEach(x -> System.out.println(x));
    }

    static int [] print(int [] arr){

        for(int x=0; x< arr.length; x++){

            arr[x]  = arr[x] * -1;            // the simple rule here is    4 * -1  = -4
                                              //                           -4 * -1  =  4
        }
        return arr ;
    }
}
