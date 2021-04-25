package a_Very_Easy;

/*
Create a function that takes an integer and returns the factorial of that integer. That is,
 the integer multiplied by all positive lower integers.

Examples
factorial(3) ➞ 6

factorial(5) ➞ 120

factorial(13) ➞ 6227020800
 */


public class Easy_108_factorial {

    public static void main(String[] args) {
// 1 2 3 4 5 6
        System.out.println(print(13));
    }

    static  long print(int a){                //we  must take the result as  "long" datatype because if we take "int"
                                              // then the result is over the max value of "int"
        int addNumbers = 1;
        long result = 1;
        while(addNumbers < a){

            result  = (result * ++addNumbers);

            System.out.println(result);
        }

        return  result;
    }
}
