package b_Easy;

import java.util.Arrays;

/*
Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.

Examples
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]
minMax([2334454, 5]) ➞ [5, 2334454]
minMax([1]) ➞ [1, 1]

Notes
All test arrays will have at least one element and are valid.
 */
public class E_037_Array_min_max {

    public static void main(String[] args) {

        int[] arr = new int[] {10,15,5,4,25};
        System.out.println(print(arr));
    }

    static  int [] print(int []arr ){
        Arrays.sort(arr);
        return new int [] { arr [0], arr[arr.length -1] } ;
    }


    static  int [] print_2(int []arr ){            // with this type we can also do it
        int[] arr2 = new int [2];
        arr2[0] = Arrays.stream(arr2).min().getAsInt();
        arr2[1] = Arrays.stream(arr2).max().getAsInt();

        return arr2;
    }


}

