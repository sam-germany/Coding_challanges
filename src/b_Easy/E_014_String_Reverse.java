package b_Easy;

/*
Create a method that takes a string as its argument and returns the string in reversed order.

Examples
reverse("Hello World") ➞ "dlroW olleH"
reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"

Notes
You can expect a valid string for all test cases.
 */
public class E_014_String_Reverse {

    public static void main(String[] args) {

        System.out.println(print("Hello World"));
    }

    static String print(String str){


        return  new StringBuilder(str).reverse().toString();

    }
}

