package a_Very_Easy;
/*
I'm trying to watch some lectures to study for my next exam but I keep getting distracted by meme compilations, vine compilations, anime, and more on my favorite video platform.

Your job is to help me create a function that takes a string and checks to see if it contains the following words or phrases:

"anime"
"meme"
"vines"
"roasts"
"Danny DeVito"
If it does, return "NO!". Otherwise, return "Safe watching!".

Examples
preventDistractions("vines that butter my eggroll") ➞ "NO!"
preventDistractions("Hot pictures of Danny DeVito") ➞ "NO!"
preventDistractions("How to ace BC Calculus in 5 Easy Steps") ➞ "Safe watching!"
 */

public class Easy_122_Array_forEach {

    public static void main(String[] args) {

        String [] arr = new String[]{"aaa", "bbb", "ccc"};

        System.out.println(print("beau-ti- aaa ful", arr ));
    }

    static String print(String str, String [] arr) {

        boolean b= false;
        for(String x : arr){

            if(str.contains(x))    b=true;

        }
        return  b ? "No": "Safe Watching";





    }
}
