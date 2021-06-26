package b_Easy;

import java.util.Arrays;
import java.util.Collections;

/*
Create a function that takes an array of strings and returns the words that are exactly four letters.

Examples
isFourLetters(["Tomato", "Potato", "Pair"]) ➞ ["Pair"]
isFourLetters(["Kangaroo", "Bear", "Fox"]) ➞ ["Bear"]
isFourLetters(["Ryan", "Kieran", "Jason", "Matt"]) ➞ ["Ryan", "Matt"]

Notes
You can expect valid strings for all test cases.
 */
public class E_078_Streams_toArray {

    public static void main(String[] args) {

        String[] arr = new String[]{"Ryan", "Kieran", "Jason", "Matt"};
        System.out.println(print(arr));
    }

    static  String [] print(String [] arr){


        return Arrays.stream(arr).filter(x -> x.length() == 4).toArray(String[]::new);

    }
}

