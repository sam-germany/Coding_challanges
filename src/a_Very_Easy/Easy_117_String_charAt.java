package a_Very_Easy;
/*
Mubashir has started his journey from home. Given a string of directions (N=North, W=West, S=South, E=East), he will walk for one minute in each direction. Determine whether a set of directions will lead him back to the starting position or not.

Examples
backToHome("NEWE") ➞ false
backToHome("NENESSWW") ➞ true
backToHome("NEESSW") ➞ false
 */

public class Easy_117_String_charAt {

    public static void main(String[] args) {

        System.out.println(print("NNEEWWS"));
    }

    static boolean print( String str){

        int  n =0, e=0, w=0, s=0;

        for(int x=0; x<str.length(); x++){

            if(str.charAt(x) == 'N') n++;
            else if(str.charAt(x) == 'E') e++;
            else if(str.charAt(x) == 'W') w++;
            else  s++;
        }

        return    n == e && w== s;
        }
    }

