package a_Very_Easy;

/*
Given two integers, a and b, return true if a can be divided evenly by b. Return false otherwise.
Examples

dividesEvenly(98, 7) ➞ true
// 98/7 = 14

dividesEvenly(85, 4) ➞ false
// 85/4 = 21.25

Notes

a will always be greater than or equal to b.
*/


public class Easy_022 {

    public static void main(String[] args) {


        System.out.println( print(85,4));
    }

    static boolean print(int a, int b){

     return   a<b ? false :  a% b  == 0 ;

    }

}
