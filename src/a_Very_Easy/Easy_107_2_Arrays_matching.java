package a_Very_Easy;

/*
Create a function that takes in two arrays: the array of user-typed words, and the array of correctly-typed words and outputs an array containing 1s (correctly-typed words) and -1s (incorrectly-typed words).

Inputs:
User-typed Array: ["cat", "blue", "skt", "umbrells", "paddy"]
Correct Array: ["cat", "blue", "sky", "umbrella", "paddy"]

Output: [1, 1, -1, -1, 1]
Examples
correctStream(
  ["it", "is", "find"],
  ["it", "is", "fine"]
) ➞ [1, 1, -1]

correctStream(
  ["april", "showrs", "bring", "may", "flowers"],
  ["april", "showers", "bring", "may", "flowers"]
) ➞ [1, -1, 1, 1, 1]
 */

import java.util.stream.IntStream;

public class Easy_107_2_Arrays_matching {

    public static void main(String[] args) {

        String[] arr = new String[]{"aaa", "bbb", "ccc"};
        String[] arr2 = new String[]{"aaa", "bbb", "ccd"};


        System.out.println(print(arr, arr2));
    }

    static int [] print(String[] arr, String[] arr2) {

        return IntStream.range(0, arr.length)
                        .map( x-> arr[x].equals(arr2[x]) ? 1: -1)
                        .toArray();
    }
}


