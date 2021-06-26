package b_Easy;
/*
Write a function that takes three string arguments (first, last, and word) and returns true if word is found between first and last in the dictionary, otherwise false.

Examples
isBetween("apple", "banana", "azure") ➞ true
isBetween("monk", "monument", "monkey") ➞ true
isBetween("bookend", "boolean", "boost") ➞ false

Notes
All letters will be in lowercase.
All three words will be different.
 */
public class E_073_String_compareTo {

    public static void main(String[] args) {

        System.out.println(print("apple", "banana", "azure"));
    }

    static  boolean print(String first, String last, String word){

        return first.compareTo(word) < 0  &&    last.compareTo(word) > 0;

//       first less-then word    &&   last less-then word
    }
}
/*
  "b".compareTo("b");   <--  0   equal
  "b".compareTo("c");   <-- -1   b smaller then c
  "c".compareTo("b");   <--  1   c greater then b

  "dc".compareTo("cd");  <-- 1   dc greater then cd
 */
