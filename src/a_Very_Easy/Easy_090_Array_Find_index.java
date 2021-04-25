package a_Very_Easy;
/*
Create a function that finds the index of a given item.

Examples
search([1, 5, 3], 5) ➞ 1
search([9, 8, 3], 3) ➞ 2
search([1, 2, 3], 4) ➞ -1

Notes
If the item is not present, return -1.
 */

public class Easy_090_Array_Find_index {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5};

        System.out.println(print(arr,3));
    }

    static  int print(int []arr, int b){

        int result = 0;
        for(int x=0; x<arr.length; x++){

            if(b == arr[x]) {
               return x;
            }
        }
      return -1;
        }
    }

