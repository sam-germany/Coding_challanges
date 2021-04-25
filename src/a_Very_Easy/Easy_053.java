package a_Very_Easy;

/*
Create a function that inverts the rgb values in an array.

Examples
invertColor([255, 255, 255]) ➞ [0, 0, 0]
// [255, 255, 255] is the color white.
// The opposite is [0, 0, 0], which is black.

invertColor([12, 13, 200]) ➞ [243, 242, 55]
invertColor([12, 17, 197]) ➞ [243, 238, 58]
invertColor([243, 242, 235]) ➞ [12, 13, 20]
invertColor([0, 0, 0]) ➞ [255, 255, 255]
invertColor([165, 170, 221]) ➞ [90, 85, 34]

Notes
255 is the max value of a single color channel.
 */
public class Easy_053 {

    public static void main(String[] args) {

        int [] arr = new int[]{12, 17, 197};

        System.out.println( print(arr));
    }

    static int []  print(int [] arr){

   int [] arr2 = new int[]{255 - arr[0],   255 -arr[1],    255 - arr[2] };

    return arr;
    }

}
