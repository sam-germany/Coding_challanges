package b_Easy;

import java.util.Arrays;

/*
Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.

Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"
nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */
public class E_006_String_swap {

    public static void main(String[] args) {

        System.out.println(print("aaa bbb"));
    }

    static  String print(String str){

        String [] arr = str.split(" ");

        return arr[1] + " " + arr[0];

    }


    static  String print_2(String str){    // by swaping

        String []  arr = str.split(" ");

         String swap  = arr[0];
         arr[0] = arr[1];
         arr[1] = swap;

         return  String.join(" ", arr);
    }
}

