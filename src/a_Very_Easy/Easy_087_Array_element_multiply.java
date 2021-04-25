package a_Very_Easy;
/*
Return the sum of all items in an array, where each item is multiplied by its index (zero-based). For empty arrays, return 0.

Examples
indexMultiplier([1, 2, 3, 4, 5]) ➞ 40
// (1*0 + 2*1 + 3*2 + 4*3 + 5*4)

indexMultiplier([-3, 0, 8, -6]) ➞ -2
// (-3*0 + 0*1 + 8*2 + -6*3)
 */

public class Easy_087_Array_element_multiply {

    public static void main(String[] args) {

        int[] arr = new int[]{-3, 0 , 8, -6};

        System.out.println(print(arr));
    }

    static  int print(int [] arr){
      int num = 0;

      for(int i=0; i< arr.length; i++){
          num += arr[i]*i;
      }

      return num;

        }
    }


