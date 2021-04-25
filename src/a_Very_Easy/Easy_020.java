package a_Very_Easy;

/*
Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
Examples

sumOfAngles(3) ➞ 180
sumOfAngles(4) ➞ 360
sumOfAngles(6) ➞ 720
Notes

    n will always be greater than 2.
    The formula (n - 2) x 180 gives the sum of all the measures of the angles of an n-sided polygon
 */
public class Easy_020 {

    public static void main(String[] args) {

        System.out.println( print(4));
    }

    static int print(int a){

     return  (a-2)*180;

    }

}
