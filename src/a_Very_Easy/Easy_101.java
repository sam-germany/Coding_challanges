package a_Very_Easy;

/*
Write a function that takes an integer and returns a string with the given number of "a"s in Edabit.

Examples
howManyTimes(5) ➞ "Edaaaaabit"
howManyTimes(0) ➞ "Edbit"
howManyTimes(12) ➞ "Edaaaaaaaaaaaabit"
Notes
The string must start with "Ed" and end with "bit".
 */

public class Easy_101 {

    public static void main(String[] args) {

        System.out.println(print(2));
    }

    static String print(int num){
      String prefix = "Eid";
      String suffix = "bit";

      StringBuilder s = new StringBuilder();

      int a = 0;
      s.append(prefix);

      while (a++ < num){
          s.append("a");
      }

      s.append(suffix);

      return s.toString();
    }
}


// return "Ed" + new String(new char[num]).replaceAll("\0", "a") + "bit";          <--this is the shortcut, but i am not able
//                                                                                     to understand it.
