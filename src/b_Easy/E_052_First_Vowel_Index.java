package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_052_First_Vowel_Index {

    public static void main(String[] args) {

        System.out.println(print("#apple"));
    }

    static  int print(String str){
        String voewls = "aeiou";
        str = str.toLowerCase();

        for(int x=0; x<str.length(); x++){
            char c = str.charAt(x);    //  .charAt()   will not return ASCII value, it return directly the character
            System.out.println(c);     //                 character can be any  "a", "#" , "?"

            if(voewls.indexOf(c) != -1) {
                return x;
            }
        }
        return 0;
    }
}

