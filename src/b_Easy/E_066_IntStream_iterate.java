package b_Easy;

import java.util.stream.IntStream;

/*
Create a function that finds all even numbers from 1 to the given number.

Examples
findEvenNums(8) ➞ [2, 4, 6, 8]
findEvenNums(4) ➞ [2, 4]
findEvenNums(2) ➞ [2]

Notes
If there are no even numbers, return an empty array.
 */
public class E_066_IntStream_iterate {

    public static void main(String[] args) {

            int [] arr2  =   print(8);

            for(int s: arr2) System.out.println(s);

    }

    static int[] print(int num){
//                                                      (8/2 = 4)              first .iteration( 2, 0-> 0+2)   2
        return IntStream.iterate(2, x-> x + 2).limit(num/2).toArray();    //              (2,  2-> 2+2)   4
    }                                                                          //              (2,  4-> 4+2)   6
                                                                               //              (2,  6-> 6+2)   8



    static  int [] print_2(int num){
       int value = 2;
        int [] arr = new int[num/2];

        for(int x=0; x<arr.length; x++){
              arr[x] = value;
            value = value + 2;
        }
        for(int y : arr) System.out.println(y);

        return arr  ;
    }
}

