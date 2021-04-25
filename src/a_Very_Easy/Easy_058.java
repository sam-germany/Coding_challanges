package a_Very_Easy;

import java.util.stream.Stream;

/*
Given a letter and an array of words, return whether the letter does not appear in any of the words.

Examples
forbiddenLetter("m", ["deep", "loves", "tesh"]) ➞ true
forbiddenLetter("r", ["rock", "paper", "scissors"]) ➞ false
forbiddenLetter("a", ["spoon", "fork", "knife"]) ➞ true
forbiddenLetter("m", []) ➞ true

Notes
All inputs given will be in lowercase.
 */
public class Easy_058 {

    public static void main(String[] args) {

        String [] arr = new String[]{"deep", "loves", "tesh"};

        System.out.println( print("m", arr ));
    }

    static boolean  print(String a, String [] arr){

       return Stream.of(arr).noneMatch( x -> x.contains(a));

    }

}
