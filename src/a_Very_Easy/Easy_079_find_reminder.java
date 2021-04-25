package a_Very_Easy;
/*
This is a reverse coding challenge. Normally you're given explicit directions with how to create a function. Here, you must generate your own function
to satisfy the relationship between the inputs and outputs.

Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.

Examples
[5, 7, 8, 2, 1], 2 ➞ [1, 1, 0, 0, 1]
[9, 8, 16, 47], 4 ➞ [1, 0, 0, 3]
[17, 11, 99, 55, 23, 1], 5 ➞ [2, 1, 4, 0, 3, 1]
[6, 1], 7 ➞ [6, 1]
[3, 2, 9], 3 ➞ [0, 2, 0]
[48, 22, 0, 19, 33, 100], 10 ➞ [8, 2, 0, 9, 3, 0]
 */


import java.util.Arrays;

public class Easy_079_find_reminder {

    public static void main(String[] args) {

        int [] arr = new int[]{5,7,8,2,1};

           int [] result = print(arr,6);
           Arrays.stream(result).forEach(x -> System.out.println(x));
    }

    static  int[] print(int [] arr, int b){

       return  Arrays.stream(arr).map( x -> x % b ).toArray();


    }
}
