package b_Easy;
/*
Christmas Eve is almost upon us, so naturally we need to prepare some milk and cookies for Santa! Create a method that accepts a GregorianCalendar object and returns true if it's Christmas Eve (December 24th) and false otherwise.

Examples
GregorianCalendar(2013, 11, 24) ➞ true
GregorianCalendar(2013, 0, 23) ➞ false
GregorianCalendar(3000, 11, 24) ➞ true

Notes
Dates are zero based (see resources).
All test cases contain valid dates.
 */
public class E_067_convert_Decimal_to_Binary {
    public static void main(String[] args) {

        System.out.println(print_2(10));
    }

    static String print(int decimal){

        return  Integer.toBinaryString(decimal);
    }

    static String print_2(int decimal) {
        String out = "";
        if (decimal > 0) {
            while (decimal >= 1) {
                out += "" + decimal % 2;
                decimal /= 2;
            }
            return new StringBuilder(out).reverse().toString();
        }
        return "0";
    }
}
