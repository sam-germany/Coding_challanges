package a_Very_Easy;

/*
Create a function that takes an object argument sizes (contains width, length, height keys) and returns the volume of the box.

Examples
volumeOfBox({ width: 2, length: 5, height: 1 }) ➞ 10
volumeOfBox({ width: 4, length: 2, height: 2 }) ➞ 16
volumeOfBox({ width: 1, length: 2, height: 3 }) ➞ 6

Notes
Don't forget to return the result.
Remember that the values are in an object.
Volume is length * width * height.
*/
public class Easy_027 {

    public static void main(String[] args) {

        int [] arr = new int[]{2,5,1};

        System.out.println( print(arr));
    }

    static int print(int arr[]){

        return  arr[0]* arr[1] *arr[2];
    }

}
