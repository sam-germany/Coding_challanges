package a_Very_Easy;/*
Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.

Examples
nextEdge(8, 10) ➞ 17
nextEdge(5, 7) ➞ 11
nextEdge(9, 2) ➞ 10

 Notes
(side1 + side2) - 1 = maximum range of third edge.
The side lengths of the triangle are positive integers.
Don't forget to return the result.
*/

public class Easy_005 {
    public static void main(String[] args) {
        System.out.println(print(8,10));
    }

    static  int print(int a, int b){

        return  (a + b) -1;
    }

}

