package a_Very_Easy;
/*
[[a, b], [c, d]]
Examples
calcDeterminant([
  [1, 2],
  [3, 4]
]) ➞ -2

calcDeterminant([
  [5, 3],
  [3, 1]
]) ➞ -4

calcDeterminant([
  [1, 1],
  [1, 1]
]) ➞ 0
Notes
Matrix will be in 2 * 2 form only.
 */

public class Easy_089_2D_Array_element {

    public static void main(String[] args) {

        int[] [] arr = new int[][] { {1,2}, {3,4}};

        System.out.println(print(arr));
    }

    static  int print(int [][] arr){

      return (arr[0][0]* arr[1][0]) - (arr[0][1] * arr[1][1]);
        }
    }

