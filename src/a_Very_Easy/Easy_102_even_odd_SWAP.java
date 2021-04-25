package a_Very_Easy;

/*
Create a function that goes through the array, incrementing (+1) for each odd-valued number and decrementing (-1) for each even-valued number.

Examples
transform([1, 2, 3, 4, 5]) ➞ [2, 1, 4, 3, 6]
transform([3, 3, 4, 3]) ➞ [4, 4, 3, 4]
transform([2, 2, 0, 8, 10]) ➞ [1, 1, -1, 7, 9]
 */

import java.util.Arrays;

public class Easy_102_even_odd_SWAP {

    public static void main(String[] args) {

        int[] arr = new int[]{0,2,3,4,5};


         int[] arr2 =  print(arr);

        Arrays.stream(arr2).forEach(x -> System.out.println(x));
    }

    static int [] print(int [] arr){

        for(int x=0; x<arr.length; x++){
            if(arr[x] %2 ==0){
                arr[x] -= 1;
            }else {
                arr[x] +=1;
            }
        }
        return arr;

    }
}


