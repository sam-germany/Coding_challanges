package a_Very_Easy;

import java.util.stream.IntStream;

/*
Create a function that returns a converted array of boolean values from a given bit string. Basically, a bit character 1 is true, otherwise, it's false.

Examples
integerBoolean("0110") ➞ [false, true, true, false]
integerBoolean("100101") ➞ [true, false, false, true, false, true]
integerBoolean("10") ➞ [true, false]
integerBoolean("001") ➞ [false, false, true]

Notes
Characters in the given bit string are absolutely 1's and 0's only.
 */
public class Easy_142_IntStream_forEach {
    public static void main(String[] args) {

        boolean [] bb =  print("0110");

         for( boolean x : bb){
             System.out.println(x);
         }
    }

    static boolean [] print(String str){

        boolean [] b = new boolean[str.length()];

        for(int x=0; x<str.length(); x++) {
           if(str.charAt(x) == '0')  b[x] = false;
           if(str.charAt(x) == '1')  b[x] = true;
        }
        return b;
    }

    static boolean [] print22(String str){         // with IntStream

        boolean [] b = new boolean[str.length()];

        IntStream.rangeClosed(0, b.length-1).forEach(n-> b[n] = str.charAt(n) == '1');
        return b;
    }

}


