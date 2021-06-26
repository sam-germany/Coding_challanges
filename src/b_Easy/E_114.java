package b_Easy;
/*
A number sequence is as follows:

5, 100, 6, 200, 7, 400, 8, 800, 9, 1600, 10, 3200, ...
Given that 5 is at position 1, create a function that returns the number found at position n in the sequence.

Examples
littleBig(4) ➞ 200
littleBig(5) ➞ 7
littleBig(28) ➞ 819200

Notes
You can expect to be only given valid inputs.
 */
public class E_114 {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 100, 6, 200, 7, 400, 8, 800, 9, 1600, 10, 3200};
        System.out.println(print(arr,4));
    }

    static  int print(int [] arr, int num){


        return num % 2<1 ? (int)Math.pow(2,num/2)*50 : num/2+5;

    }
}

