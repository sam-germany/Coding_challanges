package a_Very_Easy;

/*
Create a function that will work as the modulus operator % without using the modulus operator. The modulus operator is a way to determine the remainder of a division operation. Instead of returning the result of the division, the modulo operation returns the whole number remainder.

Examples
mod(5, 2) ➞ 1
mod(218, 5) ➞ 3
mod(6, 3) ➞ 0

 */
public class Easy_046 {

    public static void main(String[] args) {

        System.out.println( print(11,2));
    }

    static  int  print(int a, int b){

        int x = a - (a/b) * b ;


    return x;
    }

}
