package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_002_String_split {

    public static void main(String[] args) {

        System.out.println(print("Just an example here move along"));
    }

    static  int print(String str){

       String [] arr =  str.split(" ");

        return arr.length  ;

    }
}

