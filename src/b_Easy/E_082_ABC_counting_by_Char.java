package b_Easy;

/*
Imagine a messaging device with only one button. For the letter A, you press the button one time,
for E, you press it five times, for G, it's pressed seven times, etc, etc.
Write a function that takes a string (the message) and returns the total number of times the button is pressed.

Examples
howManyTimes("abde") ➞ 12
howManyTimes("azy") ➞ 52
howManyTimes("qudusayo") ➞ 123

Notes
Ignore spaces.
The given string argument will be in lower case.
 */
public class E_082_ABC_counting_by_Char {

    public static void main(String[] args) {

        System.out.println(print("abcd"));
    }

    static  int print(String str){

        return  str.chars().map(x -> x -96).sum();
    }
}
/*
main point is  Char value of  'a' = 97       so above  97 -96 = 1      so the counting will goes further
 */

