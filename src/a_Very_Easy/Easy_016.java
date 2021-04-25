package a_Very_Easy;
/*
Create a function that takes an integer and return true if it's divisible by 100, otherwise return false.
Examples

divisible(1) ➞ false
divisible(1000) ➞ true
divisible(100) ➞ true
 */
public class Easy_016 {
    public static void main(String[] args) {

        System.out.println(print( 1000));
    }

    static  boolean print(int a){

        return   a %100 == 0 ;

    }

}
