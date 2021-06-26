package b_Easy;

import java.util.stream.IntStream;

/*
Create a method that takes a single string as argument and returns
an ordered array containing the indices of all capital letters in the string.

Examples
indexOfCaps("eDaBiT") ➞ [1, 3, 5]
indexOfCaps("eQuINoX") ➞ [1, 3, 4, 6]
indexOfCaps("determine") ➞ []
indexOfCaps("STRIKE") ➞ [0, 1, 2, 3, 4, 5]
indexOfCaps("sUn") ➞ [1]

Notes
Return an empty array if no uppercase letters are found in the string.
Special characters ($#@%) and numbers will be included in some test cases.
Assume all words do not have duplicate letters.
 */
public class E_091_String_Capital_Letters_Index {

    public static void main(String[] args) {

        System.out.println(print("eDaBiT"));
    }

    static  int [] print(String str){  // easy way

        return IntStream.range(0, str.length())
                        .filter( x -> Character.isUpperCase(str.charAt(x)))
                        .toArray();
    }


    static  int [] print_2(String str) {  // long way

        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                flag++;
            }
        }
        int[] arr = new int[flag];
        flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                arr[flag] = i;
                flag++;
            }
        }
        return arr;
    }
}

