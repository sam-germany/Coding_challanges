package b_Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Create a function that returns the mean of all digits.

Examples
mean(42) ➞ 3
mean(12345) ➞ 3
mean(666) ➞ 6

Notes
The mean of all digits is the sum of digits / how many digits there are
(e.g. mean of digits in 512 is (5+1+2)/3(number of digits) = 8/3=2).
The mean will always be an integer.
 */
public class E_080_Find_Average_of_given_digits {

    public static void main(String[] args) {

        System.out.println(print_2(1234));
    }

    static int print(int a) {

        return (int) String.valueOf(a)
                .chars()
                .map(Character::getNumericValue)
                .average().getAsDouble();
    }
/*
.average()    means, as we are finding Average     1+2+3 = 6    6/quantity   means   6/3 =2
                                                int the same way this average function works.
 */

    static int print_2(int num) { //    Step by step    (1234)
        int x = 0;                //
        int y = 0;                //        x = x + (1234 % 10)      0 = 0 + (1234 % 10)      4
                                  //        num = num / 10;          1234 = 1234 / 10        123
        while(num > 0){           //Second iteration
            x = x + (num % 10);   //        x = x + (123 % 10)      x = 4 + (123 % 10)     4 + 3 = 7
                                  //        num = num / 10;         num  = 123 / 10        12
            num = num/10;         //Third iteration
                                  //
            y = y + 1;            //  x = x + (12 % 10)       x = 7 + ( 12 % 10)    7 + 2 = 9
        }                         //  num  = num / 10;        num  = 12 / 10        1
        return  x / y;            //Fourth Iteration
                                  //
                                  //  x = x +( 1 % 10)         x = 9  + (1 % 10)      9+1 =10
                                  //  num  = num / 10          num  = 1 / 10          0   <-- at this point we will get out of loop
    }
}
