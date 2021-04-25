package b_Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
Create a method that takes a string and returns a string with its letters in alphabetical order.

Examples
AlphabetSoup("hello") ➞ "ehllo"
AlphabetSoup("edabit") ➞ "abdeit"
AlphabetSoup("hacker") ➞ "acehkr"
AlphabetSoup("geek") ➞ "eegk"
AlphabetSoup("javascript") ➞ "aacijprstv"
Notes
You can assume numbers and punctuation symbols won't be included in test cases.
 You'll only have to deal with single word, alphabetic characters.
 */
public class E_064_String_sort_Alphabetically {

    public static void main(String[] args) {

        System.out.println(print_2("hello"));
    }

    static String print(String str){

       char[] cc = str.toCharArray();        //  here we have converted from  String to Char
       Arrays.sort(cc);                       // means "a" =   97  so internally  97 is stored
                                              // as it is stored in numeric so we can easily sort them
        return new String (cc) ;              // But if we put "A"  capital letter then we will get a different output
    }                                       // this is the reason he give us condition that only small letter will be
                                             // in the Test case

    static String print_2(String str){

        return str.chars()
                  .sorted()
                  .mapToObj(x-> String.valueOf( (char)x))  // as Strings are Objects so we need to take .mapToObject
                 .collect(Collectors.joining(""));
    }



}

