package b_Easy;
/*
Given a fraction as a string, return whether or not it is greater than 1 when evaluated.

Examples
greaterThanOne("1/2") ➞ false
greaterThanOne("7/4") ➞ true
greaterThanOne("10/10") ➞ false

Notes
Fractions must be strictly greater than 1 (see example #3).
 */
public class E_076_Half_portion_of_one {

    public static void main(String[] args) {

        System.out.println(print("1/2"));
    }

    static boolean print(String str){

         String [] arr = str.split("/");

        return  Integer.parseInt( arr[0] ) > Integer.parseInt(arr[1]);
    }
}
/*
1/2     means half portion of  1       it is less then 1

1/3     means  third portion of 1      it is less then  1

1/4     means forth portion of 1          it is less then 1

7/4     means forth portion of 7     so it is greater then 1

10/10   means tenth portion of 10      it means 1     <-- it is equal to 1

 */
