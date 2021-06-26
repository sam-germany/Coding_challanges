package b_Easy;
/*
Given two integers a and b, return how many times a can be halved while still being greater than b.

Examples
halveCount(1324, 98) ➞ 3
// (1324 -> 662 -> 331 -> 165.5)

halveCount(624, 8) ➞ 6
// (624 -> 312 -> 156 -> 78 -> 39 -> 19.5 -> 9.75)

halveCount(1000, 3) ➞ 8
// (1000 -> 500 -> 250 -> 125 -> 62.5 -> 31.25 -> 15.625 -> 7.8125 -> 3.90625)
Notes
Integer a will always be able to be halved at least once in every test case.
 */
public class E_094_HJalf_and_Half_again {

    public static void main(String[] args) {

        System.out.println(print(1324, 98));
    }

    static  int print(int a, int b){
        int count = 0;

        while(a/2 > b){              // main point is here we are just checking   (a/2)  (1324/2 > b)  we are not storing
            System.out.println(a);   // the value after dividing it with 2

            count++;
            a = a/2;                   // here at this point we are storing the value

            System.out.println(a);
        }

        return count ;
    }
}

