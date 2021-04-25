package a_Very_Easy;
/*
Create a function that takes a number as an argument and returns the amount of digits it has.

Examples
findDigitAmount(123) ➞ 3
findDigitAmount(56) ➞ 2
findDigitAmount(7154) ➞ 4
findDigitAmount(61217311514) ➞ 11
findDigitAmount(0) ➞ 1
 */

public class Easy_093_find_int_length {

    public static void main(String[] args) {

        System.out.println(print(123));
    }

    static  int print(int a){

        return String.valueOf(a).length();
    }
}



