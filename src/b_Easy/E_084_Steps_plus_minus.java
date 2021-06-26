package b_Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Create a function that takes a number (step) as an argument and returns the amount of boxes in that step of the sequence.

Box Sequence Image

Step 0: Start with 0
Step 1: Add 3
Step 2: Subtract 1
Repeat Step 1 & 2 ...

Examples
boxSeq(0) ➞ 0
boxSeq(1) ➞ 3
boxSeq(2) ➞ 2

Notes
Step (the input) is always a positive integer (or zero).
I have putted a image in the images folder
 */
public class E_084_Steps_plus_minus {

    public static void main(String[] args) {

        System.out.println(print(2));
    }

    static  int print(int num){

       if(num == 0) return 0;
       int count = 0;

       for(int x=1; x<=num; x++){

           if( x % 2 != 0){
               count += 3;
               System.out.println("-------");
           }else {
               count--;
               System.out.println("+++++++");
           }
       }
    return count;
    }


    static  int print_2(int num){             // shortcut way

        return (num % 2 == 0) ? num : num + 2;
    }

}

