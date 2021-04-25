package b_Easy;
/*
Write a function that takes a two-digit number and determines if it's the largest of two possible digit swaps.

To illustrate:

largestSwap(27) ➞ false

largestSwap(43) ➞ true
If 27 is our input, we should return false because swapping the digits gives us 72, and 72 > 27. On the other hand,
swapping 43 gives us 34, and 43 > 34.

Examples
largestSwap(14) ➞ false
largestSwap(53) ➞ true
largestSwap(99) ➞ true

Notes
Numbers with two identical digits (third example) should yield true (you can't do better).
 */
public class E_042_Integer_get_First_digit_Second_digit {

    public static void main(String[] args) {

        System.out.println(print(14));
    }

    static boolean print(int a){

        int dig1 = a % 10;    // 14 % 10 = 4   is the reminder, it is a trick to get the second digit value.
        int dig2 = a/10;      // 14 / 10 = 1   is the value that we can get after dividing, it is the trick to
                              //               get the first digit.
        return dig1 >= dig2;
    }


    static boolean print_2(int a){

        String aValue = String.valueOf(a);
        String reverse = new StringBuilder(aValue).reverse().toString();

        int bValue = Integer.valueOf(reverse);

        if(bValue > a) return  false;

        return true;
    }
}

