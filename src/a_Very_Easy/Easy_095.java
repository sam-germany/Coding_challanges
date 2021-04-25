package a_Very_Easy;
/*
Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.

Examples
addUp(4) ➞ 10

addUp(13) ➞ 91

addUp(600) ➞ 180300
 */

public class Easy_095 {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,5};
        System.out.println(print(arr, 12));
    }

    static  boolean print(int []arr, int b){



        for (int x = 0; x< arr.length; x++){
            if (b % arr[x] != 0)
                return  false;
        }

        return  true;
    }
}
