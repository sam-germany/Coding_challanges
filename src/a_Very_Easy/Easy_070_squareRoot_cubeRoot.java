package a_Very_Easy;

/*
Create a function that takes an array of two numbers and checks if the square root of the first number is equal to the cube root of the second number.

Examples
checkSquareAndCube([4, 8]) ➞ true
checkSquareAndCube([16, 48]) ➞ false
checkSquareAndCube([9, 27]) ➞ true
 */
public class Easy_070_squareRoot_cubeRoot {

    public static void main(String[] args) {

        System.out.println(print(10, 16));
    }

    static boolean print(int a, int b) {

        return     Math.sqrt(a)  == Math.cbrt(b);
    }
}
