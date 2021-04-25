package a_Very_Easy;
/*
Create a function that takes two numbers and a mathematical operator and returns the result.

Examples
calculate(4, 9, "+") ➞ 13
calculate(12, 5, "-") ➞ 7
calculate(6, 3, "*") ➞ 18
calculate(25, 5, "/") ➞ 5
calculate(14, 3, "%") ➞ 2

Notes
Numbers can be negative.
 */

public class Easy_085 {

    public static void main(String[] args) {

        System.out.println(print(-4,9, "-"));
    }

    static  int print(int a, int b, String operation){

        switch(operation){
            case "+": return a + b;
            case "-": return a + b;
            case "*": return a + b;
            case "/": return a + b;
            case "%": return a + b;
            default: return -1;

        }



    }
}
