package a_Very_Easy;
/*
Given two arrays, which represent two sandwiches, return whether both sandwiches use the same type of bread. The bread will always be found at the start and end of the array.

Examples
hasSameBread(
  ["white bread", "lettuce", "white bread"],
  ["white bread", "tomato", "white bread"]
) ➞ true

hasSameBread(
  ["brown bread", "chicken", "brown bread"],
  ["white bread", "chicken", "white bread"]
) ➞ false

hasSameBread(
  ["toast", "cheese", "toast"],
  ["brown bread", "cheese", "toast"]
) ➞ false
 */

public class Easy_124 {

    public static void main(String[] args) {

       String [] arr = new String[]{"brown bread", "chicken", "brown bread"};
        String [] arr2 = new String[]{"brown bread", "chicken", "brown bread2"};

        System.out.println(print(arr, arr2 ));
    }

    static boolean print(String[] arr, String [] arr2) {


        return arr[0].equals(arr2[0]) && arr[2].equals(arr2[2]);
    }

}
