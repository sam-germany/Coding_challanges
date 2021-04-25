package a_Very_Easy;
/*
Write a function that recursively finds the sum of the first n natural numbers.

Examples
sum(5) ➞ 15
// 1 + 2 + 3 + 4 + 5 = 15

sum(1) ➞ 1
 */

public class Easy_110_Recursion_Plus_numbers {

    public static void main(String[] args) {

        System.out.println(print(5));
    }

    static  int print(int num){

        if(num != 0){
            return  num + print(num -1);
        }else {
            return  num;
        }
    }
}
// in this above way of calculating we are doing   5+4+3+2+1
