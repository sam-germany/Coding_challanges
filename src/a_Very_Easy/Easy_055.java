package a_Very_Easy;

/*
Write a function that validates whether two strings are identical. Make it case insensitive.

Examples
match("hello", "hELLo") ➞ true
match("motive", "emotive") ➞ false
match("venom", "VENOM") ➞ true
match("mask", "mAskinG") ➞ false
 */
public class Easy_055 {

    public static void main(String[] args) {

        System.out.println( print("abc", "ABC"));
    }

    static boolean  print(String a, String b){

        return  a.equalsIgnoreCase(b);

    }

}
