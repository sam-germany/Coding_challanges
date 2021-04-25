package b_Easy;

import java.util.Arrays;

/*
Create a method that takes a string and returns a string in which each character is repeated once.

Examples
doubleChar("String") ➞ "SSttrriinngg"
doubleChar("Hello World!") ➞ "HHeelllloo  WWoorrlldd!!"
doubleChar("1234!_ ") ➞ "11223344!!__  "

Notes
All test cases contain valid strings. Don't worry about spaces, special characters or numbers.
They're all considered valid characters.
 */
public class E_029_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print_2("String"));
    }

    static  String print(String str){

      StringBuilder sb = new StringBuilder();

      for(int x=0; x<str.length(); x++){
          sb.append (str.charAt(x)+ str.charAt(x));
      }
        return sb.toString();
    }


    static  String print_2(String str) {

        //     return str.replaceAll("(.{1})", "$1$1");

   //     return str.replaceAll("(.{2})", "$1$1");  // StStriringng    <-- as we used {2} it takes
        //                                                                          block of two letters and   double it

        return str.replaceAll("(.{1})", "$1$1$1");  // SSStttrrriiinnnggg     "$1$1$1"  as we have taken three time 1
                                                                     //              so it returns every single character three times
    }
}
/*
 .       dot means match any character
 {x}      means occurs  x number of times, {1}  takes a block of single characters
                                           {2}  takes a block of two characters

 */
