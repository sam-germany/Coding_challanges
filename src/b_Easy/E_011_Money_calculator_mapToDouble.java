package b_Easy;

import java.util.stream.IntStream;

/*
Given a total due and an array representing the amount of change in your pocket, determine whether or not you are able to pay for the item. Change will always be represented in the following order: quarters, dimes, nickels, pennies.

To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.

Examples
changeEnough([2, 100, 0, 0], 14.11) ➞ false
changeEnough([0, 0, 20, 5], 0.75) ➞ true
changeEnough([30, 40, 20, 5], 12.55) ➞ true
changeEnough([10, 0, 0, 50], 3.85) ➞ false
changeEnough([1, 0, 5, 219], 19.99) ➞ false

Notes
quarter: 25 cents / $0.25
dime:    10 cents / $0.10
nickel:   5 cents / $0.05
penny:    1 cent  / $0.01
 */
public class E_011_Money_calculator_mapToDouble {

    public static void main(String[] args) {

        int[] arr = new int[]{2,100,0,0};

        System.out.println(print_2(arr, 12.55));
    }


    static boolean print_2(int []arr, double price){
//                                    {quarter, dime, buckle, penny}
        double[] money = new double[] {0.25,    0.10,  0.05,   0.01};

        boolean result = IntStream.range(0, arr.length).mapToDouble(i -> arr[i] * money[i]).sum() >= price;

        return result;                     //Note:  we can not use  .map()  as   (2 * 0.25)   <-- return double
    }                                      //       so we need to use  .mapToDouble()  otherwise we will get error





    static boolean print(int []arr, double price){       //  (20 * .10)     or    (.10 * 20)    both give same output

        double quarter =  arr[0] * .25;          //    System.out.println(0.25 * 5)    <-- 1.25
        double dime    =  arr[1] * .10;          //   System.out.println(.10 *21);     <-- 2.1
        double buckle  =  arr[2] * .05;          //   System.out.println(21 * .05);    <-- 1.05
        double penny   =  arr[3] * .01;          //   System.out.println(21 * .01);    <-- 0.21

        System.out.println(2 * 25);

        return  (quarter + dime + buckle + penny ) >=price ? true: false;

    }
}


