package b_Easy;

import java.util.Arrays;

/*
A group of friends have decided to start a secret society. The name will be the first
letter of each of their names, sorted in alphabetical order.

Create a function that takes in an array of names and returns the name of the secret society.

Examples
societyName(["Adam", "Sarah", "Malcolm"]) ➞ "AMS"
societyName(["Harry", "Newt", "Luna", "Cho"]) ➞ "CHLN"
societyName(["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"]) ➞ "CJMPRR"

Notes
The secret society's name should be entirely uppercased.
 */
public class E_075_String_Stream_concat {
    public static void main(String[] args) {

        String [] arr = new String[]{"Adam", "Sarah", "Malcolm"};

        System.out.println(print(arr));
    }

    static  String print(String [] arr){

         String result = Arrays.stream(arr)
                               .map( x -> String.valueOf(x.charAt(0)))
                               .sorted()
                               .reduce("", String::concat);

        return result;
    }


    static  String print_2(String [] arr){

        String result = "";

        for(int x=0; x<arr.length; x++){
            result += arr[x].charAt(x);
        }

        return String.valueOf(result);
    }
}

