package b_Easy;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Create a function that takes a string and returns a string with spaces in between all of the characters.

Examples
spaceMeOut("space") ➞ "s p a c e"
spaceMeOut("far out") ➞ "f a r  o u t"
spaceMeOut("elongated musk") ➞ "e l o n g a t e d   m u s k"

Notes
Treat a space as its own character (i.e. leave three spaces between words).
 */
public class E_041_String_replaceAll_regex_with_spaces {

    public static void main(String[] args) {

        System.out.println(print("space"));
    }

    static String print(String str){

        return  str.replaceAll(""," ").trim();
    }
}
/*
  "space"   <-- after every character their is no space   replaceAll(""," ")   <-- so here with this method
               we are replacing  ""  no space with   " "  space.
 */

