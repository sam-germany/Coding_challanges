package b_Easy;

import java.util.stream.IntStream;

/*
Write a function to reverse an array.

Examples
reverse([1, 2, 3, 4]) ➞ [4, 3, 2, 1]
reverse([9, 9, 2, 3, 4]) ➞ [4, 3, 2, 9, 9]
reverse([]) ➞ []

Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.
 */
public class E_120_Array_element_Reverse {

    public static void main(String[] args) {

        int [] arr = new int[]{9, 9, 2, 3, 4};
        System.out.println(print(arr));
    }

    static  int [] print(int [] arr){

//                                           ( 1 ,      5  )
        int [] result = IntStream.rangeClosed(1, arr.length).map(x -> arr[arr.length -x ]).toArray();
                                                         //
        return result ;                                  // .map( 1 -> arr[ 5 - 1] ).toArray();
    }                                                    // .map( 2 -> arr[ 5 - 2] ).toArray();
                                                         // .map( 3 -> arr[ 5 - 3] ).toArray();
                                                         // .map( 4 -> arr[ 5 - 4] ).toArray();
                                                         // .map( 5 -> arr[ 5 - 5] ).toArray();
    static  int [] print_2(int [] arr){
 //                               5
        int[] reverse = new int[arr.length];
 //                     4 < 5
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];      //  reverse[0] = arr[arr.length - 1 - 0];
        }                                              //  reverse[1] = arr[arr.length - 1 - 1];
        return reverse;                                //  reverse[2] = arr[arr.length - 1 - 2];
    }                                                  //  reverse[3] = arr[arr.length - 1 - 3];
}                                                      //  reverse[4] = arr[arr.length - 1 - 4];

