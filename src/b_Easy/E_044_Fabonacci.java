package b_Easy;

/*
Create a function that, given a number, returns the corresponding value of that index in the Fibonacci series.

The Fibonacci Sequence is the series of numbers:

1, 1, 2, 3, 5, 8, 13, 21, 34, ...
The next number is found by adding the two numbers before it:

The 2 is found by adding the two numbers before it (1+1).
The 3 is found by adding the two numbers before it (1+2).
The 5 is (2+3), and so on!
Examples

Fibonacci(3) ➞ 3
Fibonacci(7) ➞ 21
Fibonacci(12) ➞ 233
Notes
The first number in the sequence starts at 1 (not 0).
 */
public class E_044_Fabonacci {

    public static void main(String[] args) {
                    print_4(5);
      //   System.out.println(print(5));
    }

    static int print(int a){
        if(a<2) return 1;

        return  print(a-1) + print(a-2);
    }


    static int print_2(int a){     // 8
        int first = 1;
        int secnd = 1;

        for(int i = 0; i < a - 1; i++){
            int temp = secnd;
            secnd = first + secnd;
            first = temp;
        }
        if(a > 1)return secnd;
        else return 1;
    }


    static  void print_3(int num){ //  0,1,1,2,3       <-- here number starts from  0

        int a = 0;
        int b = 1;
        for(int x=0; x<num; x++){
            System.out.print(a +" ");
            a = a+b;
            b = a-b;
        }
    }

    static  void print_4(int num){ //  1,2,3,4,5           <-- here number start from  1

        int a = 1;
        int b = 1;
        for(int x=0; x<num; x++){
            System.out.print(a +" ");
            a = a+b;
            b = a-b;
        }
    }




}



