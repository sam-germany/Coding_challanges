package a_Very_Easy;

/*
Create a method that takes an array of integers and returns the smallest number in the set.

Examples
findSmallestNum([34, 15, 88, 2]) ➞ 2
findSmallestNum([34, -345, -1, 100]) ➞ -345
findSmallestNum([7, 7, 7]) ➞ 7
 */

import java.util.Arrays;

public class Easy_135_Arrays_min {

    public static void main(String[] args) {

        int[] arr = new int[]{34,-345,-1,100};

        System.out.println(print(arr));   // with Streams
    }

    static  int print(int[] arr){

        return Arrays.stream(arr).min().getAsInt();
    }


}
