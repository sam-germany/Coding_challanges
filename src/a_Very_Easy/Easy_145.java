package a_Very_Easy;

import java.util.stream.IntStream;

/*
Create a function that takes a number as an argument and returns an array of numbers counting down from this number to zero.

Examples
countdown(5) ➞ [5, 4, 3, 2, 1, 0]
countdown(1) ➞ [1, 0]
countdown(0) ➞ [0]
 */
public class Easy_145 {
    public static void main(String[] args) {

   //     System.out.println(print(5));
        int [] arr =  print(5);

        for(int x : arr) {
            System.out.println(x);
        }
    }

    static  int [] print(int a){

        return  IntStream.rangeClosed(0, a ).toArray();
    }

}



