package b_Easy;

import java.util.Arrays;

/*
Create a function that takes two arguments: the original price and the discount percentage as integers and returns the final price after the discount.

Alternative Text

Examples
discount(1500, 50) ➞ 750
discount(89, 20) ➞ 71.2
discount(100, 75) ➞ 25

Notes
Your answer should be rounded to two decimal places.
 */
public class E_009_price_minus_discountPercentage {

    public static void main(String[] args) {

        System.out.println(print(1500,50));
    }

    static double print(int price, int discountPercentage){

        return  price - (price * discountPercentage)/ 100;
    }
}
/*
Formula to find the discount of a price is
e.g   find  10% of  20                               formula to find the %    "(price * discountPercentage)/ 100"

      10
    -----   x   20       =  2  is Answer
     100



 */
