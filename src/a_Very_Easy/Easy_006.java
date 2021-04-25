package a_Very_Easy;/*
Create a function that takes a name and returns a greeting in the form of a string.

Examples
helloName("Gerald") ➞ "Hello Gerald!"
helloName("Tiffany") ➞ "Hello Tiffany!"
helloName("Ed") ➞ "Hello Ed!"

Notes
The input is always a name (as string).
Don't forget the exclamation mark!
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.
 */

public class Easy_006 {

    public static void main(String[] args) {
        System.out.println(print("Hello"));
    }

    static  String print(String a){

        return  "Hello " + a ;
    }

}
