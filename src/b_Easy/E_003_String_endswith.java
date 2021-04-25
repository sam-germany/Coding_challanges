package b_Easy;

/*
Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.

Examples
checkEnding("abc", "bc") ➞ true
checkEnding("abc", "d") ➞ false
checkEnding("samurai", "zi") ➞ false
checkEnding("feminine", "nine") ➞ true
checkEnding("convention", "tio") ➞ false
 */
public class E_003_String_endswith {

    public static void main(String[] args) {

        System.out.println(print("abc", "bc"));
    }

    static  boolean print(String a, String b){

         return a.endsWith(b);

       // return  a.substring(a.length() -2).equals(b);
    }
}

