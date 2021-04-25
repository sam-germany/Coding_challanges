package a_Very_Easy;
/*
Create a function to calculate how many characters in total are needed to make up the shape. You will be given an array of strings which make up a shape in the compiler (i.e. a square, a rectangle or a line).

Examples
countCharacters([
  "###",
  "###",
  "###"
]) ➞ 9

countCharacters([
  "22222222",
  "22222222",
]) ➞ 16

countCharacters([
  "------------------"
]) ➞ 18

countCharacters([]) ➞ 0

countCharacters(["", ""]) ➞ 0
 */

public class Easy_094_String_join_method {

    public static void main(String[] args) {

        String [] arr = new String[]{"###","#","###"};

        System.out.println(print(arr));
    }

    static  int print(String [] arr){

        return String.join("", arr).length();
    }
}




