package a_Very_Easy;/*
Create a function that takes voltage and current and returns the calculated power.

Examples
power(230, 10) ➞ 2300
power(110, 3) ➞ 330
power(480, 20) ➞ 9600
 */

public class Easy_004 {

    public static void main(String[] args) {

        System.out.println(print(230,10));
    }

    static  int print(int a, int b){

        return  a * b;
    }

}


