package b_Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Write a function that filters an array of numbers based on the criteria set for the number of digits.

Examples
filterByLength([12, 2000, 13, 1979, 12, 17], 2)  ➞ [12, 13, 12, 17]
// An array of only the numbers with 2 digits.

filterByLength([88, 232, 4, 9721, 555], 3) ➞ [232, 555]
// An array of only the numbers with 3 digits.

filterByLength([2, 7, 8, 9, 1012], 1) ➞ [2, 7, 8, 9]
// An array of only the numbers with a single digit.

filterByLength([32, 88, 74, 91, 300, 4050], 1) ➞ []
// No numbers with only 1 digit exist, thus, an empty array.

filterByLength([5, 6, 8, 9], 1) ➞ [5, 6, 8, 9]
// All numbers in the array have 1 digit only, thus, the original array.
Notes
If no numbers of the specified digit length exist, return an empty array.
If all numbers in the array have the specified digit length, return the original array.
The returned sub-array should have the same relative order as the original array.
 */
public class E_102_Array_element_sort_with_length {

    public static void main(String[] args) {

        int [] arr  = new int[]{12, 2000, 13, 1979, 12, 17};
        System.out.println(print( arr, 2));
    }

    static  int [] print(int [] arr, int a){


        return Arrays.stream(arr).filter(x -> String.valueOf(x).length() == a).toArray();

    }
}

