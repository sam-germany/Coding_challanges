package a_Very_Easy;

/*
Create a function that takes a string and returns it as an integer.

Examples
stringInt("6") ➞ 6
stringInt("1000") ➞ 1000
stringInt("12") ➞ 12

Notes
All numbers will be whole.
All numbers will be positive.
 */
public class Easy_061 {

    public static void main(String[] args) {

        System.out.println(print("1000"));
    }

    static int print(String a) {

        return Integer.parseInt(a);
    }
}
