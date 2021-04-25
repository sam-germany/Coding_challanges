package b_Easy;

/*
This Triangular Number Sequence is generated from a pattern of dots that form a triangle.
The first 5 numbers of the sequence, or dots, are:

1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.

Write a function that gives the number of dots with its corresponding triangle number of the sequence.

Examples
triangle(1) ➞ 1
triangle(6) ➞ 21
triangle(215) ➞ 23220
 */
public class E_004_Triangular_adding_Recursion {

    public static void main(String[] args) {

        System.out.println(print_3(6));
    }
                                          //   return a +       print_3(a -1) ;
    static  int print_3(int a){           //
                                          //     6      -----    (6-1) = 5
        if(a==1) return 1;                //     6 +5   -----    (5-1) = 4
        return a + print_3(a -1) ;     //    11 +4   -----    (4-1) = 3
    }                                     //    15 +3   -----    (3-1) = 2
                                          //    18 +2   -----    (2-1) = 1

    static  int print(int a){  //without Recursion

        int result = 0;
        for(int x=1; x<=a; x++){

            result = result+x;
        }
         return result;
    }

    static  int print_2(int a){

        return a *(1+a)/2;
    }



}

