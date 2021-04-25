package a_Very_Easy;

/*
A vehicle needs 10 times the amount of fuel than the distance it travels. However, it must always carry a minimum of 100 fuel before setting off.

Create a function which calculates the amount of fuel it needs, given the distance.

Examples
calculateFuel(15) ➞ 150
calculateFuel(23.5) ➞ 235
calculateFuel(3) ➞ 100

Notes
Distance will be a number greater than zero.
Return 100 if the calculated fuel turns out to be less than 100.
*/
public class Easy_029 {

    public static void main(String[] args) {

        System.out.println( print(5));
    }

    static int print(int a){

        return  a*10 < 100? 100 : a*10;
    }

}
