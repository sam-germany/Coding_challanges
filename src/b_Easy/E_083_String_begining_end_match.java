package b_Easy;
/*
A pair of strings form a strange pair if both of the following are true:

The 1st string's first letter = 2nd string's last letter.
The 1st string's last letter = 2nd string's first letter.
Create a function that returns true if a pair of strings constitutes a strange pair, and false otherwise.

Examples
isStrangePair("ratio", "orator") ➞ true
// "ratio" ends with "o" and "orator" starts with "o".
// "ratio" starts with "r" and "orator" ends with "r".

isStrangePair("sparkling", "groups") ➞ true
isStrangePair("bush", "hubris") ➞ false
isStrangePair("", "") ➞ true

Notes
It should work on a pair of empty strings (they trivially share nothing).
 */
public class E_083_String_begining_end_match {

    public static void main(String[] args) {

        System.out.println(print("sparkling", "groups"));
    }

    static  boolean print(String a, String b){

        if(a.length() == 0 && b.length() ==0 ) return  true;

        if(a.length() == 0 || b.length() == 0 ) return false;

        return a.charAt(0) == b.charAt(b.length()-1) && b.charAt(0) == a.charAt(a.length()-1);

    }
}

