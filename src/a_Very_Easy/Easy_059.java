package a_Very_Easy;

/*
A snail goes up the stairs. Every step, he must go up (distance = height of step), then go to the next step (distance = length of step). He wants to reach the top of the tower (tower height = tower).

Write a function that returns the distance the snail must travel to the top of the tower.

Examples
TotalDistance(0.2, 0.4, 100.0) ➞ 300.0
// Total distance is 300.

TotalDistance(0.3, 0.2, 25.0) ➞ 41.7

TotalDistance(0.1, 0.1, 6.0) ➞ 12

Notes
All given values are greater than 0.
Tolerance of returned value is 0.1.
Number of steps determined by tower height divided by stair height.
For the purposes of this exercise, the last step's length must be counted to complete the journey.
 */
public class Easy_059 {

    public static void main(String[] args) {

        System.out.println( print(0.2, 0.4, 100.0 ));
    }

    static double  print(double height, double length, double tower){

       return   (tower/height) * (height + length);
    }
}
/*
(tower/height)       <--  means we will get height of a single step

(height + length)    <--
 */
