package b_Easy;

/*
A word has been split into a left part and a right part. Re-form the word by adding
 both halves together, changing the first character to an uppercase letter.

Examples
getWord("seas", "onal") ➞ "Seasonal"
getWord("comp", "lete") ➞ "Complete"
getWord("lang", "uage") ➞ "Language"
 */
public class E_016_Substring {

    public static void main(String[] args) {

        System.out.println(print("seas", "onal"));
    }

    static String print(String a, String b){

        String s = a.substring(0,1).toUpperCase();

        return  s + a.substring(1) + b;

    }
}

