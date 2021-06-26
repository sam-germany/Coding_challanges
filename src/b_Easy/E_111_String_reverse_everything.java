package b_Easy;
/*
The "Reverser" takes a string as input and returns that string in reverse order, with the opposite case.

Examples
reverse("Hello World") ➞ "DLROw OLLEh"
reverse("ReVeRsE") ➞ "eSrEvEr"
reverse("Java compiler") ➞ "RELIPMOC AVAj"

Notes
There will be no punctuation in any of the test cases.
 */
public class E_111_String_reverse_everything {

    public static void main(String[] args) {

        System.out.println(print("Hello World"));
    }


    static  String print(String str){  // little bit hard to understand

        StringBuilder sb = new StringBuilder(str);
        String strRev = sb.reverse().toString();

        String s = "";

        for(int x=0;x<strRev.length(); x++){

            if(Character.isLowerCase(str.charAt(x))){
                s = s + (str.charAt(x)+ "").toUpperCase();
            }else{
                s = s +(str.charAt(x)+"").toLowerCase();
            }
        }

        return s;
    }








    static  String print_2(String str){  // little bit hard to understand

        return str.chars()
                .map(
                        i -> Character.isUpperCase(i) ?
                                Character.toLowerCase(i) : Character.toUpperCase(i)
                )
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                ).reverse().toString();
    }
    }


