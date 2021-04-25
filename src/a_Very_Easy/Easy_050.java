package a_Very_Easy;

/*
Write a function that returns true if both numbers are:

Smaller than 0, OR ...
Greater than 0, OR ...
Exactly 0
Otherwise, return false.

Examples

both(6, 2) ➞ true
both(0, 0) ➞ true
both(-1, 2) ➞ false
both(0, 2) ➞ false
 */
public class Easy_050 {

    public static void main(String[] args) {

        System.out.println( print(-1,0));
    }

    static  boolean print(int a, int b){

     return Integer.signum(a) == Integer.signum(b);
    }

}


// return Integer.signum(n1) == Integer.signum(n2);           <-- i this solution this also given, just see the
//                                                                documentation about  Integer.signum() method
//                                                                easy to understand
