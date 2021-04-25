package b_Easy;
/*
Zip codes consist of 5 consecutive digits. Given a string, write a function to determine whether the input is a valid zip code. A valid zip code is as follows:

Must only contain numbers (no non-digits allowed).
Must not contain any spaces.
Must not be greater than 5 digits in length.

Examples
isValid("59001") ➞ true
isValid("853a7") ➞ false
isValid("732 32") ➞ false
isValid("393939") ➞ false
 */
public class E_059_String_matches_reges_zipCode_validating {

    public static void main(String[] args) {

        System.out.println(print("591"));
    }

    static  boolean print(String str){        // validation using   String-matches(regex) method

    return  str.matches("[0-9]{5}") ; // .matches(regex)  "[0-9]"   return true if we put any character between 0-9
    }                                       //            "{5}"   return ture only if we put at-least 5 character, not more, not less


    static  boolean print_2(String str){        // validation using   Character.isDigit() method

        char [] arr =   str.toCharArray();

        if(arr.length > 5)  return  false;

        for(char c : arr){
            if(!Character.isDigit(c)) return  false;
        }
        return true ;
    }
}

