package a_Very_Easy;
/*
If two or more resistors are connected in parallel, the overall resistance of the circuit reduces. It is possible to calculate the total resistance of a parallel circuit by using this formula:

1/RTotal = 1/R1 + 1/R2 + 1/R3 ...

Create a function that takes an array of parallel resistance values, and calculates
the total resistance of the circuit.

Worked Example
parallelResistance([6, 3, 6]) ➞ 1.5

   1       1       1
  ---  +  ---   + ---  =    R-Total
   6       3       6

// 1/RTotal = 1/6 + 1/3 + 1/6
// 1/RTotal = 2/3
// RTotal = 3/2 = 1.5
Examples
parallelResistance([6, 3]) ➞ 2

parallelResistance([10, 20, 10]) ➞ 4

parallelResistance([500, 500, 500]) ➞ 166.6
// Round to the nearest decimal place
Notes
Return the RTotal, not the reciprocal.
Round to the nearest decimal place.
All inputs will be valid.
 */


public class Easy_081_R_Total {

    public static void main(String[] args) {
        int[] arr = new int[]{6,3,6};

        System.out.println(print(arr));

    }

    static  double print(int [] a){
     double result=0;

     for(int i=0; i< a.length; i++){
         double n = a[i];
         result += 1/n;
     }
       return result ;
    }
}
// very easy and simple example
