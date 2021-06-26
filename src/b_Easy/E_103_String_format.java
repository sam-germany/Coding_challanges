package b_Easy;
/*
Create a function that takes a number as an argument and returns a string formatted to separate thousands.

Examples
formatNum(1000) ➞ "1,000"
formatNum(100000) ➞ "100,000"
formatNum(20) ➞ "20"

Notes
You can expect a valid number for all test cases.
 */
public class E_103_String_format {
    public static void main(String[] args) {
         print(1000);
    }

    static  void print(int num){

        System.out.println(  String.format("%d", num)  );      // 1000
        System.out.println(  String.format("%,d", num)  );     // 1.000


        System.out.println(  String.format("%d", 1234567)  );   // 1234567
        System.out.println(  String.format("%,d", 1234567)  ); // 1.234.567






    }
}

