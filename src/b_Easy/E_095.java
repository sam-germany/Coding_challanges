package b_Easy;

import java.util.stream.IntStream;

/*
Create a function that takes two vectors as arrays and checks if the two vectors are orthogonal or not. The return value is boolean. Two vectors a and b are orthogonal if their dot product is equal to zero.

Examples
isOrthogonal([1, 2], [2, -1]) ➞ true
isOrthogonal([3, -1], [7, 5]) ➞ false
isOrthogonal([1, 2, 0], [2, -1, 10]) ➞ true

Notes
The two arrays will be of same length.

Note:  https://www.youtube.com/watch?v=8fIZ2v-33xw&t=175s
 */
// I do not understand this question
public class E_095 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2};
        int[] arr2 = new int[]{2,-1};

        System.out.println(print(arr1, arr2));
    }

    static  boolean print(int [] arr1, int [] arr2){

        return IntStream.range(0, arr1.length).map(index -> arr1[index] * arr2[index]).reduce((a, b) -> a + b).getAsInt() == 0;

    }
}

