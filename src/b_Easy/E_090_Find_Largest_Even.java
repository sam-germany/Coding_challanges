package b_Easy;

import java.util.Arrays;

/*
Write a function that finds the largest even number in an array and returns -1 if not found.

Examples
probe([3, 7, 2, 1, 7, 9, 10, 13]) ➞ 10
probe([1, 3, 5, 7]) ➞ -1
probe([0, 19, 18973623]) ➞ 0

Notes
Consider using the modulo operator % or the bitwise and operator &.
The use of built-in methods, such as Math.max(),Stream.sorted(), IntStream.of(),
and even integer binary operators, are favored.
 */
public class E_090_Find_Largest_Even {

    public static void main(String[] args) {

        int [] arr = new int[]{3, 7, 2, 1, 7, 9, 10, 13};
        System.out.println(print(arr));
    }

    static  int print(int [] arr){

        int[] arr2  = Arrays.stream(arr).filter( x-> x %2==0).sorted().toArray();

        return arr2.length == 0 ? -1 : arr2[arr2.length -1] ;

    }
}

