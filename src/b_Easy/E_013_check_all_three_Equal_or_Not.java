package b_Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

/*
Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.

Examples
equal(3, 4, 3) ➞ 2
equal(1, 1, 1) ➞ 3
equal(3, 4, 1) ➞ 0

Notes
Your function must return 0, 2 or 3.
 */
public class E_013_check_all_three_Equal_or_Not {

    public static void main(String[] args) {

        System.out.println(print(3, 4, 3));
    }

    static int print(int a, int b, int c){

        if(a == b && b == c){           // in this first  if()  statement we are sure either all three are equal or not
             return  3;
        }

        if(a == b || a == c || b== c){   // as with the above solution that all three are not equal so now either two of
            return 2;                    // them are equal or  none of them are equal, so we are putting this check like this
        }

        return 0;
    }

    static int print_2(int a, int b, int c){

        HashSet<Integer> hh = new HashSet<>();
        hh.add(a);
        hh.add(b);
        hh.add(c);

        if(hh.size() == 1){
            return  3;
        }else if(hh.size() == 2){
            return 2;
        }else {
            return 0;
        }

    }







}

