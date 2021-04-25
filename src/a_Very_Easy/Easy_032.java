package a_Very_Easy;

/*
Create a function that returns true if a string is empty and false otherwise.

Examples
isEmpty("") ➞ true
isEmpty(" ") ➞ false
isEmpty("a") ➞ false

Notes
A string containing only whitespaces " " does not count as empty.
* */
public class Easy_032 {

    public static void main(String[] args) {

        System.out.println( print(""));
    }

    static boolean print(String a){
 
        return  a.isEmpty() ? true : false ;
    }

}
