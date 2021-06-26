package b_Easy;

import java.util.Arrays;

/*
Create a method that accepts an array of two strings and checks if the letters
in the second string are present in the first string.

Examples
letterCheck(["trances", "nectar"]) ➞ true

letterCheck(["compadres", "DRAPES"]) ➞ true

letterCheck(["parses", "parsecs"]) ➞ false
Notes
Function should not be case sensitive (as indicated in the second example).
Both strings are presented as a single argument in the form of an array.
 */
public class E_097_String_finding_all_letters {

    public static void main(String[] args) {

        String[] arr = new String[]{"trances", "nectar"};
        System.out.println(print(arr));
    }

    static  boolean print(String [] arr){

        String a = arr[0].toLowerCase();
        String b = arr[1].toLowerCase();

        for(char c : b.toCharArray()){
            if(!a.contains(Character.toString(c))) return false;
        }

        return true ;

    }
}

