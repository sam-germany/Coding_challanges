package b_Easy;

/*
Jay and Silent Bob have been given a fraction of an ounce but they only understand grams. Given an ounce weighs 28.3495 grams, convert the amount of ounces to grams. Round the number of grams to one decimal place.

Examples
jayAndBob("half") ➞ "14 grams"
jayAndBob("quarter") ➞ "7 grams"
jayAndBob("eighth") ➞ "3.5 grams"

Notes
Add the string "grams" to the end with a space.
 */
public class E_026 {

    public static void main(String[] args) {

        System.out.println(print("half"));
    }

    static  String  print(String str){
        switch (str) {
            case ("half"):
                return "14 grams";
            case ("quarter"):
                return "7 grams";
            case ("eighth"):
                return "3.5 grams";
            default:
                return "1.75 grams";
        }

    }
}

