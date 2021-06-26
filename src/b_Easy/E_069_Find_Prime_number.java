package b_Easy;
/*
Create a function that returns true if a number is prime, and false otherwise. A prime number is any positive
integer that is evenly divisible by only two divisors: 1 and itself.

The first ten prime numbers are:

2, 3, 5, 7, 11, 13, 17, 19, 23, 29

Examples
isPrime(31) ➞ true
isPrime(18) ➞ false
isPrime(11) ➞ true

Notes
A prime number has no other factors except 1 and itself.
If a number is odd it is not divisible by an even number.
1 is not considered a prime number
 */
public class E_069_Find_Prime_number {

    public static void main(String[] args) {

        System.out.println(print(23));
    }

    static  boolean print(int num){

        System.out.println(Math.sqrt(23));

        if(num == 2) return  true;

        if(num < 2 || num % 2 == 0) return  false;

        for(int x=3; x<= (int) Math.sqrt(num); x +=2) {

            if(num % x == 0) return  false;
        }

        return true;
    }
}
