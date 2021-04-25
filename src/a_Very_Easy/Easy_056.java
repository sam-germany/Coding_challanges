package a_Very_Easy;

/*
Write a function that takes two numbers and returns if they should be added, subtracted, multiplied or divided to get 24.
 If none of the operations can give 24, return "none".

Examples
operation(15, 9) ➞ "added"
operation(26, 2) ➞ "subtracted"
operation(11, 11) ➞ "none"

Notes
Only integers are used as test input.
Numbers should be added, subtracted, divided or multiplied in the order they appear in the parameters.
The function should return either "added", "subtracted", "divided", "multiplied" or "none".
 */
public class Easy_056 {

    public static void main(String[] args) {

        System.out.println( print(15,9));
    }

    static String  print(int a, int b){

        return  a+b ==24? "added": a-b==24? "subtracted" : a/b ==24 ? "divided" : a*b ==24 ? "multiplied" : "none";

    }

}
