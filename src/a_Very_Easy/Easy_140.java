package a_Very_Easy;

/*
Write a function that returns true if all characters in a string are identical and false otherwise.

Examples
isIdentical("aaaaaa") ➞ true
isIdentical("aabaaa") ➞ false
isIdentical("ccccca") ➞ false
isIdentical("kk") ➞ true
 */
public class Easy_140 {
    public static void main(String[] args) {

        System.out.println(print("aaabaaa"));
    }

    static boolean print(String str){

          return  str.chars().allMatch(x ->  str.charAt(0) == x);
    }
}
