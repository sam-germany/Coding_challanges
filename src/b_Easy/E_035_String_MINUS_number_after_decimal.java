package b_Easy;

/*
Create a function that returns the number of decimal places a number (given as a string) has. Any zeros after the decimal point count towards the number of decimal places.

Examples
getDecimalPlaces("43.20") ➞ 2
getDecimalPlaces("400") ➞ 0
getDecimalPlaces("3.1") ➞ 1

Notes
Return 0 if the number doesn't have any decimal places (see example #2).
 */
public class E_035_String_MINUS_number_after_decimal {

    public static void main(String[] args) {

        System.out.println(print("2222.33"));
    }

    static  int print(String str){
        System.out.println(str.length());
        System.out.println(str.indexOf("."));
        System.out.println(str.indexOf(".") -1 );

//                                             (7  -  4 = 3)         -1  = 2  is result
        return   str.contains(".") ? (str.length() -  str.indexOf(".") -1) : 0 ;
//                                      (7)       -    (4-1 = 3)         <-- this will not calculate like this
    }
}
// if we have many minus elements in one row then minus goes from Left to Right
