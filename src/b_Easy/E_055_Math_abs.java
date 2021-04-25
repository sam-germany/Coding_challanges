package b_Easy;
/*
Write a function that returns true if the binary string can be rearranged to form a string of alternating 0s and 1s.

Examples
canAlternate("0001111") ➞ true
// Can make: "1010101"

canAlternate("01001") ➞ true
// Can make: "01010"

canAlternate("010001") ➞ false

canAlternate("1111") ➞ false
Notes
No substring of the output may contain more than one consecutive repeating character (e.g. 00 or 11 are not allowed).
Return false if a string only contains 0s or only contains 1s.
 */
public class E_055_Math_abs {

    public static void main(String[] args) {

        System.out.println(print("0001111"));
    }

    static  boolean print(String str){

        int zeros = str.replace("1", "").length();
        int ones = str.replace("0", "").length();

        int diff = Math.abs(zeros - ones);
        return diff< 2 ;
    }
}
/*
Main point to understand is that  see

Case-1         "1010101"    here 4 times 1    and  3 times 0          return true
Case-2         "01010"      here 2 times 1    and  3 times 0          return true

both the cases  when we compare 0 with 1  then either one "0" is more or   "1" is more then it return true

Math.abs(4-3)  return  +1
Math.abs(3-5)  return  +2    <-- here it convert  -2 into +2

as after comparing the difference should be 1 either  (0 with 1)  or (1 with 0)   then it return true,
if difference is greater then 1 then it return false





 */

