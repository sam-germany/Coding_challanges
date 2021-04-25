package a_Very_Easy;

/*
Write a function that returns true if k^k == n for input (n, k) and return false otherwise.

Examples
kToK(4, 2) ➞ true

kToK(387420489, 9) ➞ true
// 9^9 == 387420489

kToK(3124, 5) ➞ false

kToK(17, 3) ➞ false
 */
public class Easy_064 {

    public static void main(String[] args) {

        System.out.println(Math.pow(3,3));           // this i put just for understanding

        System.out.println(print(4,2));
    }

    static boolean print(int n, int k) {

        return   Math.pow(k,k) == n;
    }
}
