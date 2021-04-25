package b_Easy;
import java.util.Arrays;
/*
Given an unsorted array, create a function that returns the nth smallest integer
(the smallest integer is the first smallest, the second smallest integer is the second smallest, etc).

Examples
nthSmallest([1, 3, 5, 7], 1) ➞ 1
nthSmallest([1, 3, 5, 7], 3) ➞ 5
nthSmallest([1, 3, 5, 7], 5) ➞ -1
nthSmallest([7, 3, 5, 1], 2) ➞ 3

Notes
n will always be >= 1.
Each number in the array will be distinct (there will be a clear ordering).
Given an out of bounds parameter (e.g. an array is of size k),
and you are asked to find the m > k smallest integer, return -1.
 */
public class E_068_Find_given_smallest_number {

    public static void main(String[] args) {

        int[] arr = new int[]{7, 3, 5, 1};

        System.out.println(print(arr, 4));
    }

    static  int print(int [] arr, int num){

        Arrays.sort(arr);

        return num <= arr.length ? arr[num-1] : -1;
    }
}
