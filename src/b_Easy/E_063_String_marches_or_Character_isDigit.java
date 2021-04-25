package b_Easy;
/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits. Your task is to create a method that takes a string and returns true if the PIN is valid and false if it's not.

Examples
validatePIN("1234") ➞ true
validatePIN("12345") ➞ false
validatePIN("a234") ➞ false
validatePIN("") ➞ false

Notes
Some test cases contain special characters.
Empty strings must return false.
 */
public class E_063_String_marches_or_Character_isDigit {

    public static void main(String[] args) {

        System.out.println(print_2("123*4"));
    }

    static boolean print(String str){
     boolean flag = false;
        if(str.length() == 4 || str.length() ==6){

            for(int x=0; x<str.length(); x++){

              if(!Character.isDigit(str.charAt(x))){  // Character.isDigit(char c)  this method takes char as argument
                  flag =  false;
                }                                    // Character.isDigit("b")  <-- here we are passing direct string
              flag = true;                           //                            we will get a error
            }
                                                     // Character.isDigit(str.charAt(int index))
        }                                             //  here we are converting String into char data type as the char
                                                      // data type is accepted in the  .isDigit() method
        return flag;
    }


    static boolean print_2(String str) {

        return str.matches("\\d{4} | \\d{6}");
    }

}

