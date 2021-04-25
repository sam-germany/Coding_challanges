package a_Very_Easy;

/*
Create a function that converts a date formatted as MM/DD/YYYY to YYYYDDMM.

Examples
formatDate("11/12/2019") ➞ "20191211"
formatDate("12/31/2019") ➞ "20193112"
formatDate("01/15/2019") ➞ "20191501"
 */

public class Easy_133_String_Split {

    public static void main(String[] args) {

        System.out.println(print("11/12/2019"));   // with Streams
    }

    static  String print(String str){

      String [] arr =    str.split("/");


        return arr[0]+arr[1]+arr[2];
    }


}
