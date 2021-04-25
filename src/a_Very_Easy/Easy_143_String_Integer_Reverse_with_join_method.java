package a_Very_Easy;

import java.util.Arrays;
import java.util.Collections;

/*
Create a function which takes a number and returns the maximum value by rearranging its digits.

Examples
rotateMaxNumber("1213") ➞ 3211
rotateMaxNumber("1217") ➞ 7211
rotateMaxNumber("123") ➞ 321
rotateMaxNumber("001") ➞ 100
rotateMaxNumber("999") ➞ 999.
 */
public class Easy_143_String_Integer_Reverse_with_join_method {
    public static void main(String[] args) {

        System.out.println(print("213573"));
    }

    static  int print(String str){

        String[] arr = str.split("");            // Here we have created a Array

        Arrays.sort(arr, Collections.reverseOrder());    // Here we are sorting that Array to Reverse Order



        return Integer.parseInt(String.join("", arr)); // Here with the  "String.join()" method we are
    }                                                          // taking the whole elements out and by this
                                             // .join()   method we are joining these elements and make a
                                             // single String of it.
}



