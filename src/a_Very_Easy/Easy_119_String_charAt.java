package a_Very_Easy;
/*
String1: "abcbba"
String2: "abcbda"

Hamming Distance: 1 - "b" vs. "d" is the only difference.
Create a function that computes the hamming distance between two strings.

Examples
hammingDistance("abcde", "bcdef") ➞ 5
hammingDistance("abcde", "abcde") ➞ 0
hammingDistance("strong", "strung") ➞ 1
 */

public class Easy_119_String_charAt {

    public static void main(String[] args) {


        System.out.println(print("abcdef", "accdeg"));
    }

    static int print(String a, String b){

        int y = 0;
        for(int x=0; x<a.length(); x++){

            if(a.charAt(x) != b.charAt(x))
                   y++;
        }

        return y;
        }
    }

