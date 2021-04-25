package a_Very_Easy;

/*
Given an array and an index, return the value of the array with the given index.

Examples
valueAt([1, 2, 3, 4, 5, 6], 10 / 2) ➞ 6
valueAt([1, 2, 3, 4, 5, 6], 8 / 2) ➞ 5
valueAt([1, 2, 3, 4], 6.535355314 / 2) ➞ 4

Notes
Math.floor() can be helpful.
 */
public class Easy_047 {

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4};

        System.out.println( print(arr, 2));
    }

    static  int  print(int [] arr, double i){

    return   arr[(int)Math.floor(i)];
    }

}
/*

System.out.println(Math.ceil(6.1));     <--      7.0
System.out.println(Math.floor(6.9));    <--      6.0
 */
