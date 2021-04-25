package b_Easy;

/*
Create a function that takes a string and returns the number (count) of vowels contained within it.

Examples
countVowels("Celebration") ➞ 5
countVowels("Palm") ➞ 1
countVowels("Prediction") ➞ 4

Notes
a, e, i, o, u are considered vowels (not y).
All test cases are one word and only contain letters.
 */
public class E_020_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("Celebration"));
    }

    static  String print(String str){                      //   ^     <-- as the regex starts with this operator
                                                           //

    return str.replaceAll("[^aeiou]", ""); // <-- with this method we can find how many times
                                                           //     "[^aeiou]"  these words comes in the given string

  //      return str.replaceAll("[^aeiouAEIOU]", "").length();  // <-- now we are returning the length.
    }
}

