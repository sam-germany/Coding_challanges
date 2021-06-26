package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5

Note: see below how the graw will look like, and how it expands


if we enter (1, 3)    <--  6
    1 |  | 6
    3 |  | 4
    5 |  | 2

if we enter (3, 5)     <-- 8
    1 |  | 10
    3 |  | 8
    5 |  | 6
    7 |  | 4
    9 |  | 2
*/

public class E_127 {

    public static void main(String[] args) {

        System.out.println(print(3, 5));
    }

    static int print(int house, int n) {

        return 2 * n - house + 1;
    }

    static int print_2(int house, int n) {

            if(house % 2 == 0){
                return  1 + 2 * (n - 1 - (house / 2 - 1));
            }else {

                return 2 + 2 * ((2 * n - house - 1) / 2);
            }
            }


}
