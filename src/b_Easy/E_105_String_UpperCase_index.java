package b_Easy;

import java.util.stream.IntStream;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_105_String_UpperCase_index {

    public static void main(String[] args) {

        System.out.println(print("eDaBiT"));
    }

    static  int [] print(String str){

        return IntStream.range(0, str.length())
                .filter( x -> Character.isUpperCase( str.charAt(x)))
                .toArray();
    }
}
