package b_Easy;
/*
Create a method that takes an array of integers and returns an array where each integer is the sum of itself + all previous numbers in the array.

Examples
cumulativeSum([1, 2, 3]) ➞ [1, 3, 6]
cumulativeSum([1, -2, 3]) ➞ [1, -1, 2]
cumulativeSum([3, 3, -2, 408, 3, 3]) ➞ [3, 6, 4, 412, 415, 418]

Notes
Return an empty array if the input is an empty array
 */
public class E_065_Arrays_element_Adding {

    public static void main(String[] args) {

        int[] arr = new int[]{};
        System.out.println(print(arr));
    }

                                      // one more point in both the arrays if arr[] is empty then arr[] is also empty
    static int [] print(int [] arr){                  // this is with one for() loop
        int [] arr2 = new int[arr.length];
        int value = 0;

        for(int x=0; x<arr.length;x++){
            value = value + arr[x];
            arr2[x] = value;
        }
        for(int x: arr2) System.out.println(x);
        return arr2;
    }




    static  int [] print_2(int [] arr){        // this is with nested for() loop
       int result=0;
       int [] arr2 = new int[arr.length];

       for(int x=0; x<arr.length; x++){

              for(int y= 0; y<=x; y++){
                  arr2[x] = arr2[x] + arr[y];
              }
       }
        return arr2;

    }
}

