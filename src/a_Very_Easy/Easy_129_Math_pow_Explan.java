package a_Very_Easy;
/*
Create a function, that will for a given a, b, c, do the following:

Add a to itself b times.
Check if the result is divisible by c.
Examples
abcmath(42, 5, 10) ➞ false
// 42+42 = 84,84+84 = 168,168+168 = 336,336+336 = 672, 672+672 = 1344
// 1344 is not divisible by 10

abcmath(5, 2, 1) ➞ true

abcmath(1, 2, 3) ➞ false
Notes
In the first step of the function, a doesn't always refer to the original a.
"if the result is divisible by c", means that if you divide the result and c, you will get an integer (5, and not 4.5314).
The second test is correct.
 */


public class Easy_129_Math_pow_Explan {

    public static void main(String[] args) {

   //     System.out.println(print(42,5,1));     // without  Math.pow()  method

        System.out.println(print2(42,5,1));     // with  Math.pow()  method
    }

    static  int print2(int a, int b, int c){

        System.out.println(Math.pow(2,2));  // means   2*2 = 4.0
        System.out.println(Math.pow(3,2));  // means   3*3 = 9.0
        System.out.println(Math.pow(2,3));  // means   2*2*2 = 8.0

        return (a * (int)Math.pow(2, b)) ;  //  2*2*2*2*2 = 32        42*32 = 1344
                                            //  this is same as
    }                                       // 42+42 = 84,84+84 = 168,168+168 = 336,336+336 = 672, 672+672 = 1344



    static  int print(int a, int b, int c){      // without Math.pow() method
        int sum = 1;

        while(b > 0){
            sum = sum * a;
            --b;
        }
        return sum;
    }

}

