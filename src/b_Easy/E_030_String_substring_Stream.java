package b_Easy;

import java.util.stream.Stream;

/*
Create a method that takes an array of names and returns an array where only the first letter of each name is capitalized.

Examples
capMe(["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
capMe(["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]
capMe(["Slyvia", "Kristal", "Sharilyn", "Calista"]) ➞ ["Slyvia", "Kristal", "Sharilyn", "Calista"]

Notes
Don't change the order of the original array.
Notice in the second example above, "MABELLE" is returned as "Mabelle".
 */
public class E_030_String_substring_Stream {

    public static void main(String[] args) {

        String [] arr = new String[]{"mavis", "senaida", "letty"};

        String [] arr2 = print(arr);

        for(String s : arr2) {
            System.out.println(s);
        }

    }

    static  String [] print(String [] arr){

    return    Stream.of(arr).map( x -> x.substring(0,1).toUpperCase() +  x.substring(1))
                           .toArray(String[]::new);



    }
}

