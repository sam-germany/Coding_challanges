package a_Very_Easy;
/*
Create a function that takes an array and a string as arguments and return the index of the string.

Examples
findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh") ➞ 2
findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue") ➞ 1
findIndex(new String[]{"a", "g", "y", "d"}, "d") ➞ 3
findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple") ➞ 0
 */

public class Easy_118_Array_Index {

    public static void main(String[] args) {

        String [] arr = new String[]{"hi", "edabit", "fgh", "abc"};

        System.out.println(print(arr, "fgh"));
    }

    static int print( String [] arr, String a){
     int x;
        for( x=0; x<arr.length; x++){
            if(a.equals(arr[x]))  break;
        }

        return x;
        }
    }

