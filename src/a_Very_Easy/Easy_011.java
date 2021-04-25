package a_Very_Easy;/*
Create a function that takes an array containing only numbers and return the first element.

Examples

getFirstValue([1, 2, 3]) ➞ 1
getFirstValue([80, 5, 100]) ➞ 80
getFirstValue([-500, 0, 50]) ➞ -500

Notes
The first element in an array always has an index of 0.
 */














public class Easy_011 {


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};

        System.out.println(print( arr ));
    }

    static  int print(int [] aa){

        return   aa[0] ;

    }
}
