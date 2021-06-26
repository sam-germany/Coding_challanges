package b_Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
A fruit juice company tags their fruit juices by concatenating the first three
letters of the words in a flavor's name and its capacity.

Create a function that creates the product IDs for the variety of fruit juices.

Examples
getDrinkID("apple", "500ml") ➞ "APP500"
getDrinkID("pineapple", "45ml") ➞ "PIN45"
getDrinkID("passion fruit", "750ml") ➞ "PASFRU750"

Notes
Capacity will be given as a string and will always be given in ml.
Return the product ID in UPPERCASE.
 */
public class E_125_Array_Streams {

    public static void main(String[] args) {

        System.out.println(print("passion fruit", "750ml"));
    }

    static  String print(String a, String ml){

        String [] arr =  a.split(" ");
        String str ="";

        for(String x : arr){
            str = str + x.substring(0,3).toUpperCase();
        }

        return  str + ml.substring(0, ml.length() -2);
    }


    static  String print_2(String a, String ml){

        return   Arrays.stream(a.split(" "))
                       .map( x -> x.substring(0,3).toUpperCase() )
                       .collect(Collectors.joining()) + ml.replace("ml", "");
    }

}

