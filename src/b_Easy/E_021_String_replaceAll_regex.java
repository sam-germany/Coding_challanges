package b_Easy;

/*
Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.

Rules
Return a boolean value (true or false).
Return true if the amount of x's and o's are the same.
Return false if they aren't the same amount.
The string can contain any character.
When "x" and "o" are not in the string, return true.

Examples
getXO("ooxx") ➞ true
getXO("xooxx") ➞ false

getXO("ooxXm") ➞ true
// Case insensitive.

getXO("zpzpzpp") ➞ true
// Returns true if no x and o.

getXO("zzoo") ➞ false
Notes
Remember to return true if there aren't any x's or o's.
Must be case insensitive.
 */
public class E_021_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("ooXX"));
    }

    static  boolean print(String str){

 return str.replaceAll("[^oO]", str).length() == str.replaceAll("[^xX]", str).length();
    }
}
/*

str.replaceAll("[^oO]", "abcdooo")      <-- this will return "ooo"   , it search how many times the given
                                   character in the regex came here. and return so many time the  same character

System.out.println(print("aaaa"));    <-- if we put "aaaa" as String  then it return true, as the given
                                          condition is not checked.
 */
