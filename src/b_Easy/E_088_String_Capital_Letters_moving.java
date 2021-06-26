package b_Easy;
/*
Create a function that moves all capital letters to the front of a word.

Examples
capToFront("hApPy") ➞ "APhpy"
capToFront("moveMENT") ➞ "MENTmove"
capToFront("shOrtCAKE") ➞ "OCAKEshrt"

Notes
Keep the original relative order of the upper and lower case letters the same.
 */
public class E_088_String_Capital_Letters_moving {

    public static void main(String[] args) {

        System.out.println(print("hApPy"));
    }

    static  String print(String str){

        return str.replaceAll("[a-z]", "") + str.replaceAll("[A-Z]", "");

    }
}

