package b_Easy;
/*
Given two strings, create a function that returns the total number of unique characters from the combined string.

Examples
countUnique("apple", "play") ➞ 5
// "appleplay" has 5 unique characters:
// "a", "e", "l", "p", "y"

countUnique("sore", "zebra") ➞ 7
countUnique("a", "soup") ➞ 5

Notes
Each word will contain at least one letter.
All words will be lower cased.
 */
public class E_093_String_Find_unique_characters {
    public static void main(String[] args) {

        System.out.println(print("apple", "play"));
    }

    static  int print(String a, String b){

        return  (int)(a + b).chars()
                            .distinct()
                            .count();
    }
}

