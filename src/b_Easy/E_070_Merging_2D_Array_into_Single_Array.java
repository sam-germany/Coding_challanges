package b_Easy;
/*
Create a function to concatenate two integer arrays.

Examples
concat([1, 3, 5], [2, 6, 8]) ➞ [1, 3, 5, 2, 6, 8]
concat([7, 8], [10, 9, 1, 1, 2]) ➞ [7, 8, 10, 9, 1, 1, 2]
concat([4, 5, 1], [3, 3, 3, 3, 3]) ➞ [4, 5, 1, 3, 3, 3, 3, 3]
 */
public class E_070_Merging_2D_Array_into_Single_Array {

    public static void main(String[] args) {

        int[][] arr = new int[][]{ {1,3,5}, {2,6,8}};

          int [] arr3 =  print(arr);
          for(int x: arr3){
              System.out.println(x);
          }
    }


    static  int [] print(int [][] arr){         // normally type by creating  Nested for() loops

        int index=0;
        int [] arr2 = new int[arr[0].length+ arr[1].length];

        for(int x=0; x<arr.length; x++){
            for (int y=0; y<arr[0].length; y++ ){
                arr2[index++] = arr[x][y];
            }
        }

        return arr2 ;
    }
}

