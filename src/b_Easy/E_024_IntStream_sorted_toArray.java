package b_Easy;

import java.util.stream.IntStream;

/*
Write a function that takes an array of numbers and returns the second largest number.

Examples
secondLargest([10, 40, 30, 20, 50]) ➞ 40
secondLargest([25, 143, 89, 13, 105]) ➞ 105
secondLargest([54, 23, 11, 17, 10]) ➞ 23

Notes
There will be at least two numbers in the array.
 */
public class E_024_IntStream_sorted_toArray {

    public static void main(String[] args) {

        int[] arr = new int[]{10,40,30,20,50};

             int [] arr2 =  print(arr);
             for(int x : arr2) {
                 System.out.println(x);
             }
    }

    static  int [] print(int [] arr){

        return IntStream.of(arr).sorted().toArray();
    }
}
// IntStream.of(arr).sorted().toArray();    <-- with this it will put all the elements into a Array

