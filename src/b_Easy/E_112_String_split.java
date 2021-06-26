package b_Easy;

/*
Create a method that takes a string as an argument and converts the first character
of each word to uppercase. Return the newly formatted string.

Examples
makeTitle("This is a title") ➞ "This Is A Title"
makeTitle("capitalize every word") ➞ "Capitalize Every Word"
makeTitle("I Like Pizza") ➞ "I Like Pizza"
makeTitle("PIZZA PIZZA PIZZA") ➞ "PIZZA PIZZA PIZZA"

Notes
You can expect a valid string for each test case.
Some words may contain more than one uppercase letter (see example #4).
 */
public class E_112_String_split {

    public static void main(String[] args) {

        System.out.println(print("This is a title"));
    }

    static  String print(String str){

       String [] arr =  str.split(" ");
       String res = "";

       for(String s1 : arr) {
           res = res + s1.toUpperCase().charAt(0) +s1.substring(1) + " ";
       }
        return  res.trim();

    }
}

