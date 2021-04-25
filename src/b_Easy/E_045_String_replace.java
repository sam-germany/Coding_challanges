package b_Easy;

import java.util.stream.Stream;

/*
Create a function that returns the number of hashes and pluses in a string.

Examples
hashPlusCount("###+") ➞ [3, 1]
hashPlusCount("##+++#") ➞ [3, 3]
hashPlusCount("#+++#+#++#") ➞ [4, 6]
hashPlusCount("") ➞ [0, 0]

Notes
Return [0, 0] for an empty string.
Return in the order of [hashes, pluses].
 */
public class E_045_String_replace {

    public static void main(String[] args) {

        System.out.println(print("###+"));
    }

    static  int [] print(String str){

        return     new int[]{ str.replace("+","").length(),
                              str.replace("#","").length() };
    }
}

