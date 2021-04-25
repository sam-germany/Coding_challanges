package b_Easy;

/*
Try to imagine a world in which you might have to stay home for 14 days at any given time. Do you have enough TP to make it through?

Although the number of squares per roll of TP varies significantly, we'll assume each roll has 500 sheets, and the average person uses 57 sheets per day.

Create a function that will accept the following parameters:

people  — Number of people in the household.
tp      — Number of rolls.
Return a statement telling the user if they need to buy more TP!

Examples
tpChecker(4, 1) ➞ "Your TP will only last 2 days, buy more!"
tpChecker(3, 20) ➞ "Your TP will last 58 days, no need to panic!"
tpChecker(4, 12) ➞ "Your TP will last 26 days, no need to panic!"
 */
public class E_038_Toilet_Papper_coding_challange {

    public static void main(String[] args) {

        System.out.println(print(3,20));
    }

    static  String print(int a, int b){

        int totalSheets =  500 * b;

        int x =  totalSheets / (57 * a);

        if(x<=2) return  "your TP last for "+ x+ "days, buy more";

       return  "your TP last for " + x + "days, no Panic";

    }
}

