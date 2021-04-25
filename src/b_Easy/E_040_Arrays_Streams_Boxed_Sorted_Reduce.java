package b_Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/*
Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.

Examples
maxTotal([1, 1, 0, 1, 3, 10, 10, 10, 10, 1]) ➞ 43
maxTotal([0, 0, 0, 0, 0, 0, 0, 0, 0, 100]) ➞ 100
maxTotal([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 40

Notes
You can select any 5 numbers from the given array to form maximum possible total.
 */
public class E_040_Arrays_Streams_Boxed_Sorted_Reduce {

// Note: Step 1, first sort the Array and then add the last 5 numbers,

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 0, 1, 3, 10, 10, 10, 10, 1};

        System.out.println(print(arr));
    }

    static int print(int[] arr) {

        Optional<Integer> op = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).limit(5).reduce(Integer::sum);

        return op.get();
    }

/*
Arrays.stream(arr).sorted()     <-- if we use  only .sorted() then their is not need of  .boxed()

Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())  <-- if we use  "Collections.reverseOrder()"
                                                                inside .sorted() then we need to first .boxed()
                                               the Stream, after that we we can put this sorting order

.limit(5)      <-- it takes first 5 elements

.reduce(Integer::sum)  <-- it takes all the 5 elements one by one and add them.
 */

    static int print_2(int[] arr) {        // easiest way without using Streams
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 5; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}


