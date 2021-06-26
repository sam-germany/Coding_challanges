package b_Easy;
/*
Additional spaces have been added to a sentence. Return the correct sentence by removing them.
 All words should be separated by one space, and there should be no spaces at the beginning or end of the sentence.

Examples
correctSpacing("The film   starts       at      midnight. ")
➞ "The film starts at midnight."

correctSpacing("The     waves were crashing  on the     shore.   ")
➞ "The waves were crashing on the shore."

correctSpacing(" Always look on    the bright   side of  life.")
➞ "Always look on the bright side of life."
 */
public class E_118_String_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("The film   starts       at      midnight. "));
    }

    static  String print(String str){

        return str.replaceAll("[ ]+", " ").trim();
    }
}
/*
 "[ ]+"  <--as we have used  "+"  plus sign at the end, it means  "empty space + empty space.."   replace-to  " " <-- single space

 */
