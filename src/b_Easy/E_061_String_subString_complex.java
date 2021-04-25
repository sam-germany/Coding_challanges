package b_Easy;
/*
Create a function that takes a string and returns the middle character(s). If the word's length is odd, return the middle character. If the word's length is even, return the middle two characters.

Examples
getMiddle("test") ➞ "es"
getMiddle("testing") ➞ "t"
getMiddle("middle") ➞ "dd"
getMiddle("A") ➞ "A"

Notes
All test cases contain a single word (as a string).
 */
public class E_061_String_subString_complex {

    public static void main(String[] args) {

        System.out.println(print("abcde"));
    }


    static String print(String str){     //main point is we are doing divide here so  5/2 = 2    it will not give us 2.5

        int strLength = str.length();    //But if we divide   5 / 2.0 = 2.5     as we are dividing with double it gives us double 2.5 output

        if( strLength % 2 == 0){
//                                (4/2 = 2) -1 = 1 , ( 4/2 = 2) + 1 = 3)
            return str.substring( (strLength/2) -1 , (strLength/2) +1);
        }else {
//                               ( 5/2 = 2 )  , (5/2 = 2) +1  = 3
            return str.substring( strLength/2 , (strLength/2) +1);
        }
    }
}

