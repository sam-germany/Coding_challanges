package a_Very_Easy;

/*
Create a function that calculates the area of a rectangle. If the arguments are invalid, your function must return -1.
Examples

area(3, 4) ➞ 12
area(10, 11) ➞ 110
area(-1, 5) ➞ -1
area(0, 2) ➞ -1
*/
public class Easy_025 {

    public static void main(String[] args) {

        System.out.println( print(-1,4));
    }

    static int print(int a, int b){

        return  a<=0 || b<= 0 ? -1 : a*b;
    }

}
