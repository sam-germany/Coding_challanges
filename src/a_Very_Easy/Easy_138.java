package a_Very_Easy;

/*
Tesha is getting old but she wants to celebrate her 20th or 21st birthday only. It is possible with some basic maths skills. She just needs to select the correct number base with your help!

For example, if her current age is 22, that's exactly 20 - in base 11. Similarly, 65 is exactly 21 - in base 32 and so on.

Create a function that takes her current age and returns the given age 20 (or 21) years, with number base in the format specified in the below examples.

Examples
happyBirthday(54) ➞ "Tesha is just 20, in base 27!"
happyBirthday(46) ➞ "Tesha is just 20, in base 23!"
happyBirthday(65) ➞ "Tesha is just 21, in base 32!"
happyBirthday(83) ➞ "Tesha is just 21, in base 41!"
happyBirthday(66) ➞ "Tesha is just 20, in base 33!"
happyBirthday(22) ➞ "Tesha is just 20, in base 11!"

Notes
Given age will always be greater than 20.
 */
public class Easy_138 {

    public static void main(String[] args) {

        System.out.println(print(20));
    }

    static String print(int age){

        return age % 2 == 0 ?   "Tesha is just 20, in base " + age/2 + "!"
                            :   "Tesha is just 21, in base " + (age-1)/2 + "!";
    }
}
