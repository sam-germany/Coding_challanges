package b_Easy;

/*
Create a function that repeats each character in a string n times.

Examples
repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"
repeat("hello", 3) ➞ "hhheeellllllooo"
repeat("stop", 1) ➞ "stop"
 */
public class E_047_String_Repeating_Recursion {

    public static void main(String[] args) {

        System.out.println(print("mice", 5));
    }

    static  String print(String str, int a){


        return  str.replaceAll("{5}","");

    }
}

