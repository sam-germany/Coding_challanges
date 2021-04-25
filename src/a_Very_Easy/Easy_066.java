package a_Very_Easy;

/*
Write a function that takes an integer and:

If the number is a multiple of 3, return "Hello".
If the number is a multiple of 5, return "World".
If the number is a multiple of both 3 and 5, return "Hello World".

Examples
helloWorld(3) ➞ "Hello"
helloWorld(5) ➞ "World"
helloWorld(15) ➞ "Hello World"
 */
public class Easy_066 {

    public static void main(String[] args) {

        System.out.println(print(3));
    }

    static String print(int a) {

        return  a%3 == 0 && a%5 == 0 ? "Hello World" : a%3 == 0 ? "World": "Hello";
    }
}
