package a_Very_Easy;
import java.util.stream.IntStream;
/*
Create a function that takes in an array (slot machine outcome) and returns true if all elements in the array are identical, and false otherwise. The array will contain 4 elements.

Examples
testJackpot(["@", "@", "@", "@"]) ➞ true
testJackpot(["abc", "abc", "abc", "abc"]) ➞ true
testJackpot(["SS", "SS", "SS", "SS"]) ➞ true
testJackpot(["&&", "&", "&&&", "&&&&"]) ➞ false
testJackpot(["SS", "SS", "SS", "Ss"]) ➞ false

Notes
The elements must be exactly identical for there to be a jackpot.
 */


public class Easy_128_String_AllMatch {

    public static void main(String[] args) {

        String [] arr = new String[]{"@", "@", "@"};

        System.out.println(print(arr));
    }

    static  boolean print(String [] arr){

        return IntStream.range(0, arr.length).allMatch(x -> arr[0].equals(arr[x]));
    }
}

//       return 1 == Arrays.stream(arr).distinct().count();
