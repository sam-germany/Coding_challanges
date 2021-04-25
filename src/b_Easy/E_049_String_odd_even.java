package b_Easy;

/*
Write a function that takes all even-indexed characters and odd-indexed characters from a string and concatenates them together.

To illustrate:

indexShuffle("abcd") ➞ "acbd"
// "ac" (even-indexed) + "bd" (odd-indexed)
Examples
indexShuffle("abcdefg") ➞ "acegbdf"
indexShuffle("holiday") ➞ "hldyoia"
indexShuffle("maybe") ➞ "myeab"

Notes
0 should be treated as an even number.
 */
public class E_049_String_odd_even {
    public static void main(String[] args) {

        System.out.println(print_2("holiday"));
    }

    static  String print(String str){
       String oddValue ="";
       String evenValue ="";
       String [] arr =  str.split("");

       for(int x=0; x<arr.length; x++){

           if(x%2==0) {
               evenValue += arr[x];
           }

           if(x%2!=0) {
               oddValue += arr[x];
           }
       }

     return   evenValue + oddValue;
    }

    static  String print_2(String str){
        String oddValue ="";
        String evenValue ="";

        for(int x=0; x<str.length(); x++){

            if(x%2==0) {
                evenValue += str.charAt(x);
            }

            if(x%2!=0) {
                oddValue += str.charAt(x);
            }
        }

        return   evenValue + oddValue;
    }


}

