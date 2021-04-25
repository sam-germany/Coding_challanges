package b_Easy;

/*
An isogram is a word that has no duplicate letters. Create a function that takes a string and returns either true or false depending on whether or not it's an "isogram".

Examples
isIsogram("Algorism") ➞ true

isIsogram("PasSword") ➞ false
// Not case sensitive.

isIsogram("Consecutive") ➞ false
Notes
Ignore letter case (should not be case sensitive).
All test cases contain valid one word strings.
 */
public class E_050_String_find_Duplicate {

    public static void main(String[] args) {

        System.out.println(print("PasSword"));
    }

    static  boolean print(String str){

        return (int)str.toLowerCase().chars().distinct().count()  ==   str.length() ;

    }
}

