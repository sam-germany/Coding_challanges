package a_Very_Easy;

/*
Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.

Examples
isEvenOrOdd(3) ➞ "odd"
isEvenOrOdd(146) ➞ "even"
isEvenOrOdd(19) ➞ "odd"

Notes
Dont forget to return the result.
Input will always be a valid integer.
Expect negative integers (whole numbers).
Tests are case sensitive (return "even" or "odd" in lowercase
 */
public class Easy_034 {

    public static void main(String[] args) {

        System.out.println( print(5));
    }

    static String  print(int a){
         if (a < 0) return "wrong number";

        return  a %2==0? "even": "odd";
    }

}
