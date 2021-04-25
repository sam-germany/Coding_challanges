package b_Easy;

/*
Find the  discount      25%   of  20
 */
public class E_008_find_discountPercentage {

    public static void main(String[] args) {

        System.out.println(print(20,25));
    }

    static double print(int price, int discountPercentage){

        return  price * discountPercentage/ 100;
    }
}
/*
Formula to find the discount of a price is
e.g   find  10% of  20                               formula to find the %    "(price * discountPercentage)/ 100"

      10
    -----   x   20       =  2  is Answer
     100



 */
