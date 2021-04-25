package b_Easy;

import java.util.Arrays;

/*
Write a function that takes a string as an argument and returns the left most digit in the string.

Examples
leftDigit("TrAdE2W1n95!") ➞ 2
leftDigit("V3r1ta$") ➞ 3
leftDigit("U//DertHe1nflu3nC3") ➞ 1
leftDigit("J@v@5cR1PT") ➞ 5

Notes
Each string will have at least two numbers.
Return the result as an integer.
 */
public class E_056_String_to_char_to_Int {

    public static void main(String[] args) {

        System.out.println(print("TrAdE2W1n95!"));
    }

    static int print(String str) {

        for (char c : str.toCharArray()) {      //  .toCharArray()    convert the String to a Char

            if (Character.isDigit(c)) {         // .isDigit()   if a character is a Numeric value then return ture, else false
                return Integer.parseInt(Character.toString(c));
            }                                            // Character.toString(c)  <-- here we are converting the chat to String
        }
        return 0;
    }


    static int print_2(String str) {

        for (char c : str.toCharArray()) {   //  .toCharArray()    convert the String to a Char
           if (Character.isDigit(c)) {       // .isDigit()   if a character is a Numeric value then return ture, else false

                return Character.getNumericValue('2');
            }                            // .getNumericValue('2');   return   2         <- this is ok
        }                                //
        return 0;                        //  .getNumericValue('T');   return  29   <-- if we pass any other character other then
    }                                    //                             then numeric value then we will get unexpected result.
                                          // this is a reason we put a check for numeric value   Character.isDigit(c)
                                         // and only after checking we are passing that value



}
