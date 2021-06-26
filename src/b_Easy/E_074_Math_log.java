package b_Easy;
/*
Create a function that takes a number a and finds the missing exponent x so that a when raised to the power of x is equal to b.

Examples
solveForExp(4, 1024) ➞ 5
solveForExp(2, 1024) ➞ 10
solveForExp(9, 3486784401) ➞ 10

Notes
a is raised to the power of what in order to equal b?
 */
public class E_074_Math_log {
// Note:   this question i do not understand it.

    public static void main(String[] args) {

        System.out.println(print(4, 1024));
    }

    static  int print(int a, int b){

        return (int) (Math.log10(b) / Math.log10(a));
    }

    static  int print_2(int a, int b){

        for(int i=0;i<=b;i++){
            if(Math.pow(a,i)==b)
                return i;

        }return 0;
    }
}

