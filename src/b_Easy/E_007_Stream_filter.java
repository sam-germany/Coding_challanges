package b_Easy;

import java.util.Arrays;

/*
Write a function that returns true if there exists at least one number that is larger than or equal to n.

Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true
existsHigher([1, 2, 3, 4, 5], 8) ➞ false
existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
existsHigher([], 5) ➞ false

Notes
Return false for an empty array [].
 */
public class E_007_Stream_filter {

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,15,2,4};

        System.out.println(print(arr, 20));
    }

    static boolean print(int [] arr , int b){

         int result =  (int)Arrays.stream(arr).filter(x -> x > b).count();


        return  result == 0 ? false: true;
    }


}

