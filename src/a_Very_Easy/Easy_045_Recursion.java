package a_Very_Easy;

/*
Write a function that returns the length of a string. Make your function recursive.

Examples
length("apple") ➞ 5
length("make") ➞ 4
length("a") ➞ 1
length("") ➞ 0
 */
public class Easy_045_Recursion {

    public static void main(String[] args) {

        System.out.println( print("apple"));
    }

    static  int  print(String str){

       if(str.length() == 0){
           return 0;
       }
       int x = 1+ print(str.substring(1));
        System.out.println(x);
       return  x;
    }

}
