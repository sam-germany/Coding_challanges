package a_Very_Easy;

/*
Create a function that takes a number as an argument and returns the square root of that number cubed.

Examples
cubeSquareRoot (81) ➞ 729
cubeSquareRoot (1646089) ➞ 2111932187
cubeSquareRoot (695556) ➞ 580093704

Notes
All numbers will evenly square root, so don't worry about decimal numbers.
 */
public class Easy_067 {

    public static void main(String[] args) {

        System.out.println(print(3));
    }

    static int print(int a) {

        return  (int)Math.pow(a, 1.5);
    }
}
