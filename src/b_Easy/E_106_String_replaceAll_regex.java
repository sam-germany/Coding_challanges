package b_Easy;
/*
Create a method that takes a string, removes all "special" characters (e.g. ., !, @, #, $, %, ^, &, \, *, (, )) and returns the new string. The only non-alphanumeric characters allowed are dashes -, underscores _ and spaces.

Examples
removeSpecialCharacters("The quick brown fox!") ➞ "The quick brown fox"
removeSpecialCharacters("%fd76$fd(-)6GvKlO.") ➞ "fd76fd-6GvKlO"
removeSpecialCharacters("D0n$c sed 0di0 du1") ➞ "D0nc sed 0di0 du1"
 */
public class E_106_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print_2("%fd76$ fd(-)6GvKlO._"));
    }

    static  String print(String str){

        return str.replaceAll("[^-_a-zA-Z0-9\\s]", "");
    }

    static  String print_2(String str){

        return str.replaceAll("[^\\w\\s]", "");
    }
}
/*
\\s   <--  if for  white-spaces   but as we can see above  we need to use double "\\s" back.slash  otherwise we will get error

\\w   <-- this is shortcut for the  "[a-zA-Z_0-9]"

*/
