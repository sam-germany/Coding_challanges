package b_Easy;

/*
Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".

If the number is a multiple of 3 the output should be "Fizz".
If the number given is a multiple of 5, the output should be "Buzz".
If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
If the number is not a multiple of either 3 or 5, the number should be output on its own
as shown in the examples below.
The output should always be a string even if it is not a multiple of 3 or 5.

Examples
fizzBuzz(3) ➞ "Fizz"
fizzBuzz(5) ➞ "Buzz"
fizzBuzz(15) ➞ "FizzBuzz"
fizzBuzz(4) ➞ "4"

Notes
Try to be precise with how you spell things and where you put the capital letters
 */
public class E_028 {

    public static void main(String[] args) {

        System.out.println(print(3));
    }

    static  String  print(int a){

        return   a%3==0 && a%5==0 ? "FizzBuzz" : a%3==0 ? "Fizz" : a%5==0 ? "Buzz" : ""+a;
    }
}

/*
Converting int to String          String.valueOf(4)         or      ""+4;
 */
