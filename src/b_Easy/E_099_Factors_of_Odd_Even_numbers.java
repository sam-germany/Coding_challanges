package b_Easy;
/*
Create a function that returns "even" if a number has an even number
of factors and "odd" if a number has an odd number of factors.

Examples
factorGroup(33) ➞ "even"

factorGroup(36) ➞ "odd"

factorGroup(7) ➞ "even"
Notes
You don't need to actually calculate the factors to solve this problem.
Think about why a number would have an odd number of factors.
 */
public class E_099_Factors_of_Odd_Even_numbers {

    public static void main(String[] args) {

        System.out.println(print(37));
    }

    static  String print(int num){                     //   num = 36
                                                      //
        System.out.println(Math.sqrt(num));           //   Math.sqrt(36)  = 6.0
        System.out.println(Math.sqrt(num) % 1);       //   Math.sqrt(36) % 1  =  0.0
        System.out.println(Math.sqrt(num) % 1 == 0);

        return Math.sqrt(num) % 1 == 0 ? "odd" : "even";
    }
}
/*
Case -2                                                 num = 32

System.out.println(Math.sqrt(num));             //   Math.sqrt(37)  = 6.0827
System.out.println(Math.sqrt(num) % 1);         //   Math.sqrt(36) % 1  =  0.08276253
System.out.println(Math.sqrt(num) % 1 == 0);    // returns  false







 */




