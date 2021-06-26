package b_Easy;
/*
Create a function that checks if the argument is an integer or a string.
Return "int" if it's an integer and "str" if it's a string.

nNote: this question means, find the value with it we can devide both of the numbers, but greatest divided value

Examples
intOrString(8) ➞ "int"
intOrString("Hello") ➞ "str"
intOrString(9843532) ➞ "int"

Notes
Input will either be an integer or a string.
 */
public class E_079_Finding_higher_Division {

    public static void main(String[] args) {

        System.out.println(print(17,13));
    }
//                   (  9 , 3  )
    static int print(int a, int b){  // little lengthy code but easier to understand
        int largest;
        int smallest;

        if(a <b) {
            smallest = a;
            largest = b;
        }else{
            smallest = b;
            largest = a;
        }

        for(int x=smallest; x>0; x--){
            if(smallest % x == 0){
                if(largest % x == 0){
                    return x;
                }
            }
        }
    return 1;
    }



    static  int print_2(int a, int b){    // smaller code but harder to understand

        System.out.println(a + " "+ b);
        if(b == 0) return  a;

        return  print(b, a%b);
    }


    static  int print_3(int a, int b){    // with Recursion

        return b==0 ? a : print_3(b, a % b);
    }

}

