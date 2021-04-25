package a_Very_Easy;

/*
Create a method that accepts an array and returns the last item in the array.

Examples
getLastItem([1, 2, 3]) ➞ 3
getLastItem([0]) ➞ 0
getLastItem([-1, -3]) ➞ -3
 */
public class Easy_051 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,-3};

        System.out.println( print(arr));
    }

    static  int print(int [] arr){

     return   arr[arr.length-1];
    }

}
