package b_Easy;

/*
Count the amount of ones in the binary representation of an integer. For example, since 12 is 1100 in binary, the return value should be 2.

Examples
countOnes(0) ➞ 0
countOnes(100) ➞ 3
countOnes(999) ➞ 8

Notes
The input will always be a valid integer (number).
 */
public class E_048_BitCount {

    public static void main(String[] args) {
        System.out.println(print2(999));
    }

    static int print(int a) {
        return Integer.bitCount(a);
    }

/*
Converting Decimal to Binary      convert  10   to Binary   ==   1010, in above code it will return  2
                                                        as  1+0+1+0 = 2,   we have 2 times 1 so output is 2 at end
 */

    static int print2(int a) {
        if (a == 0){
            return 0;
        }else{
            return (a & 1) + print2(a >> 1);
        }
    }

}
