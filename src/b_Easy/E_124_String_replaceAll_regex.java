package b_Easy;
/*
Create a function that will remove the letters "a", "b" and "c" from the given
string and return the modified version. If the given string does not contain "a", "b", or "c", return null.

Examples
removeABC("Tesha is my world") ➞ "Tesh is my world"
removeABC("This might be a bit hard") ➞ "This might e  it hrd"
removeABC("hello world!") ➞ null
removeABC("") ➞ null

Notes
If the given string does not contain "a", "b", or "c", return null.
 */
public class E_124_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("This might be a bit hard"));
    }

    static  String print(String str){

        String a = str.replaceAll("(?i)[abc]", "");

        return   str.equals(a) ? null : a;

    }
}

