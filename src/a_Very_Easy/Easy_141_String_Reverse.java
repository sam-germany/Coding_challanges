package a_Very_Easy;

/*
Create a function that takes a string of lowercase characters and returns that string reversed and in upper case.

Examples
reverseCapitalize("abc") ➞ "CBA"
reverseCapitalize("hellothere") ➞ "EREHTOLLEH"
reverseCapitalize("input") ➞ "TUPNI"
 */
public class Easy_141_String_Reverse {
    public static void main(String[] args) {

        System.out.println(print("abc"));
    }

    static String print(String str){

          return  new StringBuilder(str).reverse().toString().toUpperCase();
    }
}


//Note:   String class do not have any  .reverse() method so we have to use StringBuilder()  class  .reverse() method
