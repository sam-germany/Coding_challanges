package a_Very_Easy;/*
Create a function that takes length and width and finds the perimeter of a rectangle.

Examples
findPerimeter(6, 7) ➞ 26
findPerimeter(20, 10) ➞ 60
findPerimeter(2, 9) ➞ 22
 */

public class Easy_003_parameter_of_Rectangle {
    public static void main(String[] args) {

        System.out.println(print(2,2));
    }

    static  int print(int length, int width){

        return 2 * length + 2 * width;
    }
}
