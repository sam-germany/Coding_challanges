package a_Very_Easy;

import java.util.stream.IntStream;

/*
Create a method that takes an integer as an argument. Add up all the numbers
from 1 to the number you passed to the function. For example, if the input is 4 then your
function should return 10 because 1 + 2 + 3 + 4 = 10.

Examples
addUp(4) ➞ 10

addUp(13) ➞ 91

addUp(600) ➞ 180300
 */

public class Easy_099_int_sum {

    public static void main(String[] args) {

        System.out.println(print(600));
    }

    static int print(int a){

        return IntStream.rangeClosed(1, a).sum();
    }
}
