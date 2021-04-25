package b_Easy;

import java.util.Arrays;

/*
Create a function that takes an array as an argument and returns true or false depending on whether the average of all elements in the array is a whole number or not.

Examples
isAvgWhole([1, 3]) ➞ true
isAvgWhole([1, 2, 3, 4]) ➞ false
isAvgWhole([1, 5, 6]) ➞ true
isAvgWhole([1, 1, 1]) ➞ true
isAvgWhole([9, 2, 2, 5]) ➞ false
 */
public class E_034_Find_Average {

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4};
        System.out.println(print(arr));
    }
// formula of finding Average is  (a) first add all the numbers   {1,2,3,4}     <-- 1+2+3+4 =  10
//                                (b) then divide them with the number of elements    10/4 = 2
//                                 (c) as in this example we get a reminder so it return false

    static boolean print(int [] arr){
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        return sum % arr.length == 0 ? true : false;
    }



    static boolean print_2(int [] arr){      // shortcut way

        return  Arrays.stream(arr).sum() % arr.length == 0;
    }
}

