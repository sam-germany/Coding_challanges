package a_Very_Easy;

import java.util.ArrayList;
import java.util.List;

/*
Mubashir created an infinite loop! Help him by fixing the code in the code tab to pass
this challenge. Look at the examples below to get an idea of what the function should do.

Examples

PrintArray(1) ➞ [1]
PrintArray(3) ➞ [1, 2, 3]
PrintArray(6) ➞ [1, 2, 3, 4, 5, 6]
 */
public class Easy_018 {

    public static void main(String[] args) {
        System.out.println( print( 4));
    }

    static List<Integer> print(int a){
      List<Integer> ll = new ArrayList<>();

        for(int x=1; x<=a; x++){

            ll.add(x);
        }
    return ll;
    }

}
