package b_Easy;
/*
Write a function that takes a string, and returns a new string with any duplicate consecutive letters removed.

Examples
unstretch("ppoeemm") ➞ "poem"
unstretch("wiiiinnnnd") ➞ "wind"
unstretch("ttiiitllleeee") ➞ "title"
unstretch("cccccaaarrrbbonnnnn") ➞ "carbon"

Notes
Final strings won't include words with double letters (e.g. "passing", "lottery").

Note: main point is in this question all duplicates words are written together, they are not seperated
if we write duplicate words seperately then the below second case will not work
 */
public class E_123_String_remove_Duplicate {

    public static void main(String[] args) {

        System.out.println(print_2("sppoeemmms"));
    }

    static String print(String str) {
                                                                        //"([a-zA-Z])\\1+"   <-- here  "1+"  means replace only
        return str.replaceAll("([a-zA-Z])\\1+", "$1");  //              those character which comes second times
    }                                                                    //             here, it means that all the characters,
                                                                         //      those come first time here will be returned

//                          "ppoeemm"
    static String print_2(String str){
        String result = "";

        for(int x=0; x<str.length()-1; x++){

            if(str.charAt(x) != str.charAt(x +1)) {
                result  = result + str.charAt(x);
            }
        }
        System.out.println(result);
    return  result = result +  str.charAt(str.length() -1);
    }
}
