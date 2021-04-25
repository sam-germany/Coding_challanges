package a_Very_Easy;
/*
Create a function that takes an array of strings and return the first and last elements as a new array.

Examples
firstLast(["one", "two"]) ➞ ["one", "two"]
firstLast(["edabit", "13", "true"]) ➞ ["edabit", "true"]
firstLast(["zero"]) ➞ ["zero"]
 */

public class Easy_092 {

    public static void main(String[] args) {

        String[] arr = new String[]{"one", "two"};

        System.out.println(print(arr));
    }

    static  String print(String [] arr){
      String s= "";

        if(arr.length > 0){
            s +=  arr[0];
            if(arr.length > 1){
                s += arr[arr.length-1];
            }
        }

        return s;
    }
}



