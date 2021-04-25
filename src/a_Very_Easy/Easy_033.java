package a_Very_Easy;

/*
Emmy has written a function that returns a greeting to users. However, she's in love with Mubashir, and would like to greet him slightly differently. She added a special case in her function, but she made a mistake.

Can you help her?

Examples
greeting("Matt") ➞ "Hello, Matt!"
greeting("Helen") ➞ "Hello, Helen!"
 */
public class Easy_033 {

    public static void main(String[] args) {

        System.out.println( print("bbbbbb"));
    }

    static String print(String a){
 
        return  a.equals("Mubashir") ? "Hello, my Love" : "Hello, "+a ;
    }

}
