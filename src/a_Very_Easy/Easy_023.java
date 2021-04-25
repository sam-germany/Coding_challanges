package a_Very_Easy;

/*
Create a function that takes a number as an argument and returns negative of that number. Return negative numbers without any change.
Examples

returnNegative(4) ➞ -4
returnNegative(5) ➞ -5
returnNegative(-54) ➞ -54
*/
public class Easy_023 {

    public static void main(String[] args) {

        System.out.println( print(4));
    }

    static int print(int a){
     if(a < 0){
         return a;
     } else {
         return -(a);
     }
    }

}
