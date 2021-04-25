package b_Easy;

/*
Write a function that returns true if two rooks can attack each other, and false otherwise.

Examples
canCapture(["A8", "E8"]) ➞ true
canCapture(["A1", "B2"]) ➞ false
canCapture(["H4", "H3"]) ➞ true
canCapture(["F5", "C8"]) ➞ false

Notes
Assume no blocking pieces.
Two rooks can attack each other if they share the same row (letter) or column (number).
 */
public class E_010_Array_index_charAt {

    public static void main(String[] args) {

        String [] arr = new String[]{"A3", "E3"};       // input is always same   first  come "letter" then "numeric"

        System.out.println(print(arr));
    }

    static boolean print(String [] arr){

    return  ((arr[0]).charAt(0) == (arr[1]).charAt(0) || arr[0].charAt(1)  == arr[1].charAt(1));


    }
}
/*
Formula to find the discount of a price is
e.g   find  10% of  20                               formula to find the %    "(price * discountPercentage)/ 100"

      10
    -----   x   20       =  2  is Answer
     100



 */
