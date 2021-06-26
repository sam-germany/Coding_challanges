package b_Easy;
/*
Create a function that returns true if there's at least one prime number in the given range (n1 to n2 (inclusive)),
false otherwise.

Examples
PrimeNumberInRange(10, 15) ➞ true
// Prime numbers in range: 11, 13

PrimeNumberInRange(62, 66) ➞ false
// No prime numbers in range.

PrimeNumberInRange(3, 5) ➞ true
// Prime numbers in range: 3, 5

Notes
n2 is always greater than n1.
n1 and n2 are always positive.
0 and 1 aren't prime numbers.
 */
public class E_087_Find_Prime_Number {

    public static void main(String[] args) {

        System.out.println(print(10, 15));
    }

    static  boolean print(int a, int b){

        for(int i = a; i<=b; i++){
            if(isPrime(i)) return  true;
        }
        return false;
    }

    static boolean isPrime(int n){

        if(n ==2){
            return true;
        }else if(n < 2) {
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n %i == 0) return false;
        }
    return true;
    }

}

