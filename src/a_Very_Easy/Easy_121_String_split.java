package a_Very_Easy;
/*
Create a function that counts the number of syllables a word has. Each syllable is separated with a dash -.

Examples
numberSyllables("buf-fet") ➞ 2
numberSyllables("beau-ti-ful") ➞ 3
numberSyllables("mon-u-men-tal") ➞ 4
numberSyllables("on-o-mat-o-poe-ia") ➞ 6
 */

public class Easy_121_String_split {

    public static void main(String[] args) {


        System.out.println(print("beau-ti-ful" ));
    }

    static int print(String str){

      String [] arr =    str.split("-");  // here   .split() method  break the String into parts, breaking
                                                 // applies on the basis of  "-"  given character, in above case
        return arr.length;                       // we are breaking it into 3 parts
        }
    }

//              str.split("-").length();          <-- we can use also directly like this
