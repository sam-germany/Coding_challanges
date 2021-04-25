package a_Very_Easy;

/*
Create a function that takes a string and changes the word amazing to not amazing. Return the string without any change if the word edabit is part of the string.

Examples

amazingEdabit("edabit is amazing.") ➞ "edabit is amazing."
amazingEdabit("Mubashir is amazing.") ➞ "Mubashir is not amazing."
amazingEdabit("Infinity is amazing.") ➞ "Infinity is not amazing."
 */
public class Easy_060 {

    public static void main(String[] args) {

        System.out.println( print("edabit is amazing"));
    }

    static String  print(String a){

       return   a.contains("edabit") ? a : a.replace("is", "is not") ;
    }
}
