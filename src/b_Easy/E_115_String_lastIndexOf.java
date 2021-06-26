package b_Easy;

/*
Write a function to return the city from each of these vacation spots.

Examples
grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞ "Kyoto"

Notes
There may be additional brackets, but the city will always be in the last bracket pair.
 */
public class E_115_String_lastIndexOf {

    public static void main(String[] args) {

        System.out.println(print("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]"));
    }

    static  String print(String str){

        return str.substring(str.lastIndexOf('[')+1, str.lastIndexOf(']'));

    }
}

