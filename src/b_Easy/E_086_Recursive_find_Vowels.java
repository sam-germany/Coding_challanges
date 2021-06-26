package b_Easy;
/*
Write a function that recursively returns the number of vowels in a string.

Examples
countVowels("apple") ➞ 2
countVowels("cheesecake") ➞ 5
countVowels("bbb") ➞ 0
countVowels("") ➞ 0

Notes
All letters will be in lower case.
Vowels are: a, e, i, o, u.
 */
public class E_086_Recursive_find_Vowels {

    public static void main(String[] args) {

        System.out.println(print("apple"));
    }

    static  int print(String str){
       if(str.equals("")) return 0;

       char c = str.charAt(0);

       if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
              return 1 + print(str.substring(1));
          }

       return print(str.substring(1));
    }

    static  int print_2(String str){
        if(str.isEmpty()) return 0;

        int count = "aeiou".contains("" + str.charAt(0)) ? 1 : 0;

        return count + print(str.substring(1));
    }
}

