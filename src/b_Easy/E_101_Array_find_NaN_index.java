package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_101_Array_find_NaN_index {

    public static void main(String[] args) {

        double [] arr  = new double[]{1, 2, 0};   // i tried to pua NaN in the double[] but getting error
        System.out.println(print(arr));
    }

    static  int print(double [] arr){

     for(int x=0; x<arr.length; x++){

         if(Double.isNaN(arr[x]))
             return x;
     }

        return  -1;

    }
}

