package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_036_String_replaceAll_regex_character {

    public static void main(String[] args) {

        System.out.println(print("the aardvark", '#'));
    }

    static  String print(String str, char ch){

        return str.replaceAll("[aeiou]",String.valueOf(ch)) ;

    }
}
/*
Case-1   ( without ^)
-------
return str.replaceAll("[aeiou]",String.valueOf(ch));     th# ##rdv#rk    <-- it means put "#" in all the places
                                                                            where  "[aeiou]" these words come

   return str.replaceAll("[^aeiou]",String.valueOf(ch));   ##e#aa###a##   <-- it means put "#" on all the places
                                                              where except these character any other character is



 */
