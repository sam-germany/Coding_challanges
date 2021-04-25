package a_Very_Easy;

/*
I have a bucket containing an amount of navy blue paint and I'd like to paint as many walls as possible. Create a function that returns the number of complete walls that I can paint, before I need to head to the shops to buy more.

n is the number of square meters I can paint.
w and h are the widths and heights of a single wall in meters.
Examples

howManyWalls(54, 1, 43) ➞ 1
howManyWalls(46, 5, 4) ➞ 2
howManyWalls(100, 4, 5) ➞ 5
howManyWalls(10, 15, 12) ➞ 0
howManyWalls(41, 3, 6) ➞ 2

Notes
Don't count a wall if I don't manage to finish painting all of it before I run out of paint.
All walls will have the same dimensions.
All numbers will be positive integers.

Note: easy to understand, just think  (100,4,5)  <-- one wall is  of  4*5=20   20 square meter,
 n= 100   means that we can paint 100 square meter, so 100 /20   = 5  means that we can paint 5 complete walls
*/
public class Easy_024 {

    public static void main(String[] args) {

        System.out.println( print(100,4,5));
    }

    static int print(int n, int w, int h){

        return  n / (w * h);
    }

}
