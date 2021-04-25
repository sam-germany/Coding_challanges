package b_Easy;

/*
Create a function that takes a word and returns true if the word has two consecutive identical letters.
means that a  pair of same two characters together,  e.g   "runn"   as  "nn"   are together

Examples
doubleLetters("loop") ➞ true
doubleLetters("yummy") ➞ true
doubleLetters("orange") ➞ false
doubleLetters("munchkin") ➞ false
 */
public class E_033_String_ReplaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("loop"));
    }

    static  boolean print(String str){

        for(int x=0; x<str.length()-1;x++) {

            if(str.charAt(x) == str.charAt(x+1)){
                return  true;
            }
        }
        return  false;
    }

 // this second will not work in this question as the below "regex" will return "true" if  "abcb"  this is
 // the given String, as it find the two identical characters, but as per the question we have to find a
 // pair  that are near by  "abbc"   so here two "bb" are together.
    static  boolean print_2(String str){

        return  str.replaceAll("[^o]", "").length() == 2;
    }



}

