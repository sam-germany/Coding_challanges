package b_Easy;

/*
Create a function that takes a string and returns a new string with all vowels removed.

Examples
removeVowels("I have never seen a thin person drinking Diet Coke.")
➞ " hv nvr sn  thn prsn drnkng Dt Ck."

removeVowels("We're gonna build a wall!")
➞ "W'r gnn bld  wll!"

removeVowels("Happy Thanksgiving to all--even the haters and losers!")
➞ "Hppy Thnksgvng t ll--vn th htrs nd lsrs!"
Notes
"y" is not considered a vowel.
Expect a valid string for all test cases.
 */
public class E_031_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print_2("I have never seen a thin person drinking Diet Coke."));
    }

    static String print(String str) {

        return str.replaceAll("[aAeEiIoOuU]", "");
    }

/*
"[aAeEiIoOuU]"          <-- in this regex it  do not start with    [^] , so in this case we are directly removing
                            the the characters as given in this regex, if any character come many times then it will
                            be replaced with ""  empty String  all of them.
 */


    static String print_2(String str) {

        return str.replaceAll("(?i)[aeiou]", "");
    }

}                         //  (?i)      <-- it makes  regex case insensitive. and rest is same as above example
