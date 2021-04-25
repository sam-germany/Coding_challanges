package b_Easy;

/*
Write a function that finds the word "bomb" in the given string (not case sensitive). Return "DUCK!"
if found, otherwise,"Relax, there's no bomb.".

Examples
bomb("There is a bomb.") ➞ "DUCK!"
bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
bomb("This goes boom!!!") ➞ "Relax, there's no bomb."

Notes
The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed).
 */
public class E_027_String_contains {

    public static void main(String[] args) {

        System.out.println(print("There is a bomb."));
    }

    static  String  print(String str){

        return str.toUpperCase().contains("BOMB") ? "Duck": "Relax no bomb" ;

    }
}

