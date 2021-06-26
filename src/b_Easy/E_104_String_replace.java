package b_Easy;
/*
POV:* You are in an exam and time has just run out. While the teacher's back is turned, you hastily take the opportunity
to finish scribbling down the last few words of the conclusion.*

For this challenge, it takes 0.5 seconds to write a character (not including spaces). Given the full sentence and the unfinished sentence as inputs,
 return the time it takes to finish writing in seconds.

Worked Example
timeToFinish(
  "I wanna tell the world Tesh, that I love you so!",
  "I wanna tell the world Tesh, that"
) ➞ 5

// "I" has 1 character
// "love" has 4 characters
// "you" has 3 characters
// "so!" has 3 characters, including punctuation.
// 1 + 4 + 3 + 3 = 11
// 11 / 2 = 5
// Remember not to include spaces.
Examples
timeToFinish(
  "I'm so preoccupied by the thougths of you Tesh.",
  "I'm so preoccupied by the"
) ➞ 9

timeToFinish(
  "And so brings my conclusion to its conclusion.",
  "And so brings my conclusion to its conclus"
) ➞ 2

timeToFinish(
  "I wanna tell the world Tesh, that I love you so!",
  "I wanna tell the world"
) ➞ 10

timeToFinish(
  "As a result, my point is still valid.",
  "As a result, my"
) ➞ 9
Notes
The unfinished sentence is always found at the start of a complete sentence.
Consider integer division with the default roundingMode = RoundingMode.HALF_DOWN.
 */
public class E_104_String_replace {

    public static void main(String[] args) {

        String a = "As a result, my point is still valid.";
        String b = "As a result, my";

        System.out.println(print(a, b));
    }

    static  int print(String a, String b){

        return   a.replace(b, "").replaceAll(" ", "").length() / 2;
    }
}

