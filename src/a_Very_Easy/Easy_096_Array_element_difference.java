package a_Very_Easy;

import java.util.Arrays;

public class Easy_096_Array_element_difference {

    public static void main(String[] args) {

        int[] arr = new int[] {10,15,20,2,10,6};

        System.out.println(print(arr));
    }

    static  int print(int []arr){

         Arrays.sort(arr);

        return   arr[arr.length -1] - arr[0];
    }
}
