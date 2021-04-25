package a_Very_Easy;

/*
Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.

Examples
makesTen(9, 10) ➞ true
makesTen(9, 9) ➞ false
makesTen(1, 9) ➞ true

Notes
Don't forget to return the result.
 */
public class Easy_019 {

    public static void main(String[] args) {

        System.out.println( print( 9,10));
    }

    static boolean print(int a, int b){



        return   a==10 || b == 10 || (a+b) ==10 ;

    }

}
