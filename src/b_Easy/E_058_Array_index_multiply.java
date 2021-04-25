package b_Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Create a function that takes an integer and returns an array from 1 to the given number, where:

If the number can be divided evenly by 4, amplify it by 10 (i.e. return 10 times the number).
If the number cannot be divided evenly by 4, simply return the number.
Examples
amplify(4) ➞ [1, 2, 3, 40]
amplify(3) ➞ [1, 2, 3]
amplify(25) ➞ [1, 2, 3, 40, 5, 6, 7, 80, 9, 10, 11, 120, 13, 14, 15, 160, 17, 18, 19, 200, 21, 22, 23, 240, 25]

Notes
The given integer will always be equal to or greater than 1.
Include the number (see example above).
 */
public class E_058_Array_index_multiply {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};

        int [] arr2 = print(25);
        for(int x: arr2) {
            System.out.println(x);
        }
    }

    static  int [] print(int num){

      return   IntStream.rangeClosed(1, num).map(x-> {
                                                    if(x%4==0){   return x*10;  }
                                                     return x;
                                               }).toArray();
    }

    static  int [] print_2(int num){       // same example with Ternary operator

        return   IntStream.rangeClosed(1, num).map(x->    x%4 ==0 ? x*10 : x   ).toArray();
    }

}

