package b_Easy;

/*
Create a function which returns the word in the string, but with all the fog letters removed.
 However, if the string is clear from fog, return "It's a clear day!".

Examples
clearFog("sky") ➞ "It's a clear day!"
clearFog("fogfogFFfoooofftogffreogffesGgfOogfog") ➞ "trees"
clearFog("fogFogFogffoObirdsanffodthebffoeffoesGGGfOgFog") ➞ "birdsandthebees"

Notes
Hidden words won't include the letters f, o or g.
Hidden words are always in lowercase.
 */
public class E_110_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("fogfogFFfoooofftogffreogffesGgfOogfog"));
    }

    static  String print(String str){

        String temp = str.replaceAll("[fogFOG]", "");

        return  temp.length() == str.length() ? "it is a clear day" : temp;

    }
}

