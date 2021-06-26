package b_Easy;
/*
Given an array of numbers, remove the largest and smallest numbers, and calculate the average of the remaining numbers.

Examples
trimmedAverages([4, 5, 7, 100]) ➞ 6
// Average of 5 and 7

trimmedAverages([10, 25, 5, 15, 20]) ➞ 15
// Average of 10, 15 and 20

trimmedAverages([1, 1, 1]) ➞ 1
// 1

trimmedAverages([5, 4, 54, 4, 6, 46, 56]) ➞ 23
Notes
Round to the nearest whole number.
Array size is always greater than two.
 */
public class E_121_Array_find_MIN_MAX {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 5, 7, 100};
        System.out.println(print(arr));
    }
    static  int print(int [] arr){
        int min  = Integer.MAX_VALUE;        //  min = 2147483647
        int max  = Integer.MIN_VALUE;        //  max = -2147483648

        double sum = 0;

        for(int x: arr){
            sum = sum +x;  // 4 + 5 + 7 + 100   = 116

            if( x < min){       //   (4 < 2147483647)
                min = x;        //     min = 4;
            }

            if( x > max) {      //    (4 > -2147483647)
                max = x;        //      max = 4;
            }
        }

        sum = sum - ( min + max);     //   sum = 116 - (4 -100)   <--

        return (int)Math.round( sum / (arr.length - 2)) ;
    }
}

