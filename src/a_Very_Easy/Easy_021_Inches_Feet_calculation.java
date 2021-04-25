package a_Very_Easy;

/*
Create a function that accepts a measurement value in inches and returns the equivalent of
the measurement value in feet.
Examples

inches_to_feet(324) ➞ 27
inches_to_feet(12) ➞ 1
inches_to_feet(36) ➞ 3

Notes

    If inches are under 12, return 0.
    12 inches = 1 foot.
*/
public class Easy_021_Inches_Feet_calculation {

    public static void main(String[] args) {

        System.out.println( print(10));
    }

    static int print(int a){

     return   a /12 ;

    }

}
