package b_Easy;
/*
Write a function that transforms all letters from [a, m] to 0 and letters from [n, z] to 1 in a string.

Examples
convertBinary("house") ➞ "01110"
convertBinary("excLAIM") ➞ "0100000"
convertBinary("moon") ➞ "0111"

Notes
Conversion should be case insensitive (see example #2).
 */
public class E_062_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("House"));
    }

    static  String print(String str){         // by using  "(?i)"   for case insensitive

        return str.replaceAll("(?i)[a-m]","0").replaceAll("(?i)[n-z]", "1") ;
    }

    static  String print_2(String str){         // by using  "(?i)"   for case insensitive

        return str.replaceAll("[a-mA-M]","0").replaceAll("[n-zN-Z]", "1") ;

    }



}

