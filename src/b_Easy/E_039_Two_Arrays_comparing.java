package b_Easy;

import java.util.Arrays;

/*
Create a function that returns true if the first array can be nested inside the second.

arr1 can be nested inside arr2 if:

1) arr1's  (MIN value)   is greater than arr2's  (MIN VALUE).
2) arr1's  (MAX VALUE)   is less than arr2's   (MAX VALUE).

Note: for understanding just draw above  two conditions  (1),(2) in mind

Examples
canNest([1, 2, 3, 4], [0, 6]) ➞ true
canNest([3, 1], [4, 0]) ➞ true
canNest([9, 9, 8], [8, 9]) ➞ false
canNest([1, 2, 3, 4], [2, 3]) ➞ false

Notes
Note the strict inequality (see example #3).
 */
public class E_039_Two_Arrays_comparing {

    public static void main(String[] args) {

        int [] arr1 = new int[]{1,2,3,4};
        int [] arr2 = new int[]{0,6};

        System.out.println(print(arr1, arr2));
    }

    static  boolean print( int[] arr1, int [] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return arr1[0] > arr2[0] && arr1[arr1.length -1] < arr2[arr2.length -1] ;
    }



// this second case i put only for the understanding purpose
    static  boolean print_2( int[] arr1, int [] arr2){

        int min1 = Arrays.stream(arr1).min().getAsInt();
        int max1 =  Arrays.stream(arr1).max().getAsInt();
        int min2 =  Arrays.stream(arr2).min().getAsInt();
        int max2 =  Arrays.stream(arr2).max().getAsInt();

        if(min1 > min2 && max1 < max2)
            return true;
        return false;
    }

}

