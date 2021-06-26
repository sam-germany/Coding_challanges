package b_Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Create a function to concatenate two integer arrays.

Examples
concat([1, 3, 5], [2, 6, 8]) ➞ [1, 3, 5, 2, 6, 8]
concat([7, 8], [10, 9, 1, 1, 2]) ➞ [7, 8, 10, 9, 1, 1, 2]
concat([4, 5, 1], [3, 3, 3, 3, 3]) ➞ [4, 5, 1, 3, 3, 3, 3, 3]
 */
public class E_071_Merge_Two_different_Arrays_into_Single_Array {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,3,5};
        int[] arr2 = new int[]{2,6,8};

        System.out.println(print(arr1,  arr2));
    }

    static  int [] print(int [] arr1, int [] arr2){

    return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }


    static  int [] print_2(int [] arr1, int [] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        return arr3;
    }
}

