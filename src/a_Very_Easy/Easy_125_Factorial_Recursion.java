package a_Very_Easy;
/*
Instructions
The recursive function for this challenge should return the factorial of an inputted integer. If anyone needs a refresher, factorials in mathematics are represented by an exclamation point placed to the right of a number: 4! = 4 x 3 x 2 x 1 = 24

Examples
factorial(5) ➞ 120

factorial(3) ➞ 6

factorial(2) ➞ 2
 */

public class Easy_125_Factorial_Recursion {

    public static void main(String[] args) {

        System.out.println(print(5));
    }

    static int print(int num) {

        if(num == 1) return  num;

        return num * print(num -1);
    }

}

//  return  num < 2 ? 1 : num * print(num -1);             <-- this is a shortcut
