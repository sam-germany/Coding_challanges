package b_Easy;

import java.util.Arrays;

/*
Create a function that takes an array of items and checks if the last item matches the rest of the array concatenated together.

Examples
matchLastItem(["i", "love", "tesh", "ilovetesh"]) ➞ true
// The last item is the rest joined.
 *
matchLastItem(["i", "am", "into", "her", "world", "iamintoherworld"]) ➞ true
// The last item is the rest joined.

matchLastItem(["1", "1", "1", "11"]) ➞ false
// The last item should be "111".

matchLastItem(["12", "13", "17", "19", "20", "40", "121317192040"]) ➞ true
Notes
The array is always filled with items.
 */
public class E_077_String_join_Arrays_copyOfRange {

    public static void main(String[] args) {

        String [] arr = new String[]{"i", "love", "tesh", "ilovetesh"};
        System.out.println(print(arr));
    }

    static  boolean print(String [] arr){
//                                                 (from-inclusive, end-exclusive)
 return  String.join("", Arrays.copyOfRange(arr, 0, arr.length-1)).equals(arr[arr.length-1]);
    }
}


