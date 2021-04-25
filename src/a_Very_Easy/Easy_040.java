package a_Very_Easy;
/*
Given two arguments, return an array which contains these two arguments.

Examples
makePair(1, 2) ➞ [1, 2]
makePair(51, 21) ➞ [51, 21]
makePair(512124, 215) ➞ [512124, 215]
 */
public class Easy_040 {

    public static void main(String[] args) {

        System.out.println( print(1,2));
    }

    static int []   print(int a, int b){


        return new int []{a,b};
    }

}
