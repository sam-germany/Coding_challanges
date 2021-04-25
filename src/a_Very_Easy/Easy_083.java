package a_Very_Easy;
/*
Create a function that will put the first argument, a character, between every word in the second argument, a string.

Examples
add("❤", "I love Tesh!") ➞ "I❤love❤Tesh!"

add("👍", "Java is a lot of fun.") ➞ "Java👍is👍a👍lot👍of👍fun."

add("#", "hello world!") ➞ "hello#world!"

add("&", "you me world") ➞ "you&me&world"
Notes
Make sure there are no spaces between words when returning the function.
 */

public class Easy_083 {

    public static void main(String[] args) {

        System.out.println(print("aa bb cc"));
    }

    static  String print(String s){

        return  s.replace(" ", "#");
    }
}
