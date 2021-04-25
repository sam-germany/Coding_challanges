package a_Very_Easy;

import java.util.Arrays;
/*
Create a function that adds a string ending to each member in an array.

Examples
addEnding(["clever", "meek", "hurried", "nice"], "ly")
➞ ["cleverly", "meekly", "hurriedly", "nicely"]

addEnding(["new", "pander", "scoop"], "er")
➞ ["newer", "panderer", "scooper"]

addEnding(["bend", "sharpen", "mean"], "ing")
➞ ["bending", "sharpening", "meaning"]
 */
public class Easy_098_Adding_Strings {

    public static void main(String[] args) {

        String [] arr = new String[]{"aaa", "bbb", "ccc"};


       String [] arr2 =  print(arr, "ly");

        Arrays.stream(arr2).forEach(x -> System.out.println(x));
    }

    static  String [] print(String [] arr, String b){

       for(int i=0; i<arr.length; i++) {
           arr[i] += b;
       }

       return arr;

    }
}
