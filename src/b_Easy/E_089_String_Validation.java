package b_Easy;

/*
When creating variables, the variable name must always start with a letter and cannot contain spaces, though numbers
and underscores are allowed to be contained in it also.

Create a function which returns true if a given variable name is valid, otherwise return false.

Examples
variableValid("result") ➞ true
variableValid("odd_nums") ➞ true
variableValid("2TimesN") ➞ false

Notes
Inputs are given as strings.
Variable names with spaces are not allowed.
Although this question may seem like otherwise, you can't actually assign words with quotes around them as variables.
 */
public class E_089_String_Validation {

    public static void main(String[] args) {

        System.out.println(print("2Abc_def"));
    }

    static  boolean print(String str){

        return !(str.contains(" ") ||  Character.isDigit(str.charAt(0)));
    }

static  boolean print_2(String str){

       if( str != null  &&
           str.length() != 0 &&
           (Character.isLetter(str.charAt(0)) || str.charAt(0) == '_') &&
           !str.contains(" ")){
                              return true;
  }

     return false;
    }

}

