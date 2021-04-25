package a_Very_Easy;
/*
Create a method that takes a positive integer n and returns the nth "star number".

A star number is a centered figurate number a centered hexagram (six-pointed star),
 such as the one that Chinese checkers is played on.

Examples
starNumber(2) ➞ 13
// n = 2
// 2nd star number = 13

starNumber(3) ➞ 37
// n = 3
// 3rd star number = 13

starNumber(5) ➞ 121
// n = 3
// 5th star number = 13
Notes
n will always be a positive integer.
The nth term of a star number can be represented as 6n(n-1) + 1
 */

public class Easy_084_Get_month_name {

    public static void main(String[] args) {

        System.out.println(print(3));
    }

    static  String print(int n){

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",} ;
        return months[n-1];
    }
}
