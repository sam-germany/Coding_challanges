package a_Very_Easy;

/*
Your job is to create a function, that takes 3 numbers: a, b, c and returns true if the last digit of a * b = the last digit of c. Check the examples below for an explanation.

Examples
lastDig(25, 21, 125) ➞ true
// The last digit of 25 is 5, the last digit of 21 is 1, and the last
// digit of 125 is 5, and the last digit of 5*1 = 5, which is equal
// to the last digit of 125(5).

lastDig(55, 226, 5190) ➞ true
// The last digit of 55 is 5, the last digit of 226 is 6, and the last
// digit of 5190 is 0, and the last digit of 5*6 = 30 is 0, which is
// equal to the last digit of 5190(0).

lastDig(12, 215, 2142) ➞ false
// The last digit of 12 is 2, the last digit of 215 is 5, and the last
// digit of 2142 is 2, and the last digit of 2*5 = 10 is 0, which is
// not equal to the last digit of 2142(2).
 */

/*
Your job is to create a function, that takes 3 numbers: a, b, c and returns true if the last digit of a * b = the last digit of c. Check the examples below for an explanation.

Examples
lastDig(25, 21, 125) ➞ true
// The last digit of 25 is 5, the last digit of 21 is 1, and the last
// digit of 125 is 5, and the last digit of 5*1 = 5, which is equal
// to the last digit of 125(5).

lastDig(55, 226, 5190) ➞ true
// The last digit of 55 is 5, the last digit of 226 is 6, and the last
// digit of 5190 is 0, and the last digit of 5*6 = 30 is 0, which is
// equal to the last digit of 5190(0).

lastDig(12, 215, 2142) ➞ false
// The last digit of 12 is 2, the last digit of 215 is 5, and the last
// digit of 2142 is 2, and the last digit of 2*5 = 10 is 0, which is
// not equal to the last digit of 2142(2).

 */
public class Easy_136_get_reminder {

    public static void main(String[] args) {

        System.out.println(print(25 ,-21 ,125));
    }

    static boolean print(int a, int b, int c){          // here he use a trick  by returning the reminder back

        int a1 = a % 10;                            //  25 % 10   <--  5   is the reminder
        int b1 = b % 10;                            // -21 % 10   <--  -2   is the reminder
        int c1 = c % 10;                            // 125 % 10   <--  5    is the reminder
        int  x  = (a1 * b1) % 10;                   // (5 * -2) % 10  <--  (10)     as  "10" can be completely divided by "10"
        return x == c1;                             //                             so   "0" is returned back as reminder
    }



    public static boolean print2(int a, int b, int c) {           // solution with converting String value
        int result = a * b;
        String x = String.valueOf(result);
        String y = String.valueOf(c);

        if(x.charAt(x.length() -1) == y.charAt(y.length() - 1))
            return true;

        return false;
    }
}
