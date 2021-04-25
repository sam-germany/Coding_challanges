package b_Easy;

/*
Create a function that takes two numbers and a mathematical operator + - / * and will
 perform a calculation with the given numbers.

Examples
calculator(2, '+', 2) ➞ 4
calculator(2, '*', 2) ➞ 4
calculator(4, '/', 2) ➞ 2

Notes
If the input tries to divide by 0, return 0.
 */
public class E_005_Calculator_by_character {

    public static void main(String[] args) {

        System.out.println(print(2, '-', 2));
    }

    static  int print(int a, char c, int b){

        switch(c){
            case '+': return a + b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}

