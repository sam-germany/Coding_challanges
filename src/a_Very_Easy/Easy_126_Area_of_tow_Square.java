package a_Very_Easy;
/*
Imagine a circle and two squares: a smaller and a bigger one. For the smaller one, the circle is a circumcircle and for the bigger one, an incircle.

Scale

Create a function, that takes an integer (radius of the circle) and returns the difference of the areas of the two squares.

Examples
squareAreasDifference(5) ➞ 50
squareAreasDifference(6) ➞ 72
squareAreasDifference(7) ➞ 98
 */

public class Easy_126_Area_of_tow_Square {

    public static void main(String[] args) {

        System.out.println(print(5));
    }

    static int print(int num) {


        return 2 * num * num;
    }

}

//  return  num < 2 ? 1 : num * print(num -1);             <-- this is a shortcut
