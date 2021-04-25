package a_Very_Easy;

/*
Create a function to multiply all of the values in an array by the amount of values in the given array.

Examples
MultiplyByLength([2, 3, 1, 0]) ➞ [8, 12, 4, 0]
MultiplyByLength([4, 1, 1]) ➞ ([12, 3, 3])
MultiplyByLength([1, 0, 3, 3, 7, 2, 1]) ➞  [7, 0, 21, 21, 49, 14, 7]
MultiplyByLength([0]) ➞ ([0])
 */

import java.util.Arrays;

public class Easy_105_Array_element_multiply {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,1,0};

         int [] arr2 = print(arr);
         Arrays.stream(arr2).forEach(x -> System.out.println( x));

 //       System.out.println(print(arr));
    }

    static int [] print(int [] arr){

       for(int x=0; x<arr.length; x++){
           arr[x] *= arr.length;
       }

       return  arr;
    }
}


