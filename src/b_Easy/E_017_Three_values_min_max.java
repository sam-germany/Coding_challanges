package b_Easy;

import java.util.Arrays;

/*
You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.

Examples
programmers(147, 33, 526) ➞ 493
programmers(33, 72, 74) ➞ 41
programmers(1, 5, 9) ➞ 8
 */
public class E_017_Three_values_min_max {

    public static void main(String[] args) {

        System.out.println(print_2(1,5,9));
    }

    static int print(int a, int b, int c){

        int min = Math.min(a, Math.min(b,c));
        int max = Math.max(a, Math.max(b,c));

        return  max -min;
    }

    static int print_2(int a, int b, int c) {

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        return arr[arr.length - 1] - arr[0];

    }

    }

