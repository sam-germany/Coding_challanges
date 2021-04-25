package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_051_String_Ternary_operator {

    public static void main(String[] args) {

        System.out.println(print("ravi", 1));
    }

    static  String print(String str, int a){

        return  (a==1? "Hello ": "Bye " )+ str.substring(0,1).toUpperCase() + str.substring(1);

    }
}

