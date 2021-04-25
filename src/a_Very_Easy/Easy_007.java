package a_Very_Easy;/*
Create a function that takes the number of wins, draws and losses and calculates
 the number of points a football team has obtained so far.

wins get 3 points
draws get 1 point
losses get 0 points

Examples
footballPoints(3, 4, 2) ➞ 13
footballPoints(5, 0, 2) ➞ 15
footballPoints(0, 0, 1) ➞ 0

Notes
Inputs will be numbers greater than or equal to 0.
 */

public class Easy_007 {

    public static void main(String[] args) {
        System.out.println(print(5,0,2));
    }

    static  int print(int chickens, int cows, int pigs){

        return   (chickens * 3)+ (cows * 1)+ (pigs* 0) ;
    }
}
