package a_Very_Easy;

import java.util.stream.IntStream;

/*
Write a function that takes the last number of a consecutive list of numbers and returns the total of all numbers up to and including it.

Examples
addUpTo(3) ➞ 6
// 1 + 2 + 3 = 6

addUpTo(10) ➞ 55
// 1 + 2 + 3 + ... + 10 = 55

addUpTo(7) ➞ 28
// 1 + 2 + 3 + ... + 7 = 28

Notes
You will only be given valid inputs.
There are various ways of doing this; try finding them!
 */
public class Easy_069 {

    public static void main(String[] args) {

        System.out.println(print(1));
    }

    static int print(int a) {


        return   IntStream.rangeClosed(0,a).sum();
    }
}
