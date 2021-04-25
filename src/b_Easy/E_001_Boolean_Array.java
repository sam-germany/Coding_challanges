package b_Easy;

/*
Create a function which returns the number of true values there are in an array.

Examples
countTrue([true, false, false, true, false]) ➞ 2
countTrue([false, false, false, false]) ➞ 0
countTrue([]) ➞ 0

Notes
Return 0 if given an empty array.
All array items are of the type bool (true or false).
 */
public class E_001_Boolean_Array {

    public static void main(String[] args) {

        boolean [] arr = new boolean[]{true, false, false, true, false};

        System.out.println(print(arr));         // Main point is, we can not use   "Arrays.stream()"  on a Boolean Array
    }                                           // Java is not showing any methods that it is showing for int or String

    static  int print(boolean [] arr){

        int y=0;
        if(arr.length > 0) {
            for (int x=0; x<arr.length; x++){

                if(arr[x] == true) y++;

            }
         return y;
        }

        return 0  ;

    }
}

