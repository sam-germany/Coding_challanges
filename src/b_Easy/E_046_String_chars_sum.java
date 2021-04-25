package b_Easy;

/*
Return true if the sum of ASCII values of the first string is same as the sum of ASCII values
of the second string, otherwise return false.

Examples
sameAscii("a", "a") ➞ true
sameAscii("AA", "B@") ➞ true
sameAscii("EdAbIt", "EDABIT") ➞ false

Notes
If you need some help with ASCII codes, check the Resources tab for an image of all ASCII codes used in this challenge.
 */
public class E_046_String_chars_sum {

    public static void main(String[] args) {

        System.out.println(print_2("abcd", 5));
    }

    static  String print(String str, int times){
        String ss="";

        for(int x=0; x<str.length(); x++){
            for(int y=0; y<times; y++){
              ss += str.charAt(x);            // str = str.charAt(x);   will not work as .charAt() return character
            }                                 //               but str +charAt() we are concatenating string + char
        }
        return ss ;
    }


    static  String print_2(String str, int times){          // this is using regex

        return str.replaceAll("(.{1})","$1$1$1$1$1") ;
    }

/*
 .       dot means match any character
 {x}      means occurs  x number of times, {1}  takes a block of single characters
                                           {2}  takes a block of two characters

 */


    static  String print_3(String str, int times) {          // this is using regex
        if (str.equals("") || times == 0) {
            return "";
        }
 return str.substring(0, 1) + print_3(str.substring(0, 1), times - 1) + print_3(str.substring(1), times);
    }
}
