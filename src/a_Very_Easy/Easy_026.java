package a_Very_Easy;

/*
Create a function that takes three arguments prob, prize, pay and returns true if prob * prize > pay; otherwise return false.

To illustrate:

profitableGamble(0.2, 50, 9)
... should yield true, since the net profit is 1 (0.2 * 50 - 9), and 1 > 0.

Examples
profitableGamble(0.2, 50, 9) ➞ true
profitableGamble(0.9, 1, 2) ➞ false
profitableGamble(0.9, 3, 2) ➞ true

Notes
A profitable gamble is a game that yields a positive net profit, where net profit is calculated in the following manner:
net_outcome = probability_of_winning * prize - cost_of_playing.
*/
public class Easy_026 {

    public static void main(String[] args) {


        System.out.println( print(0.9,1, 2));
    }

    static boolean print(double a, int b, int c){

        return  a* b > c ? true: false;
    }

}
