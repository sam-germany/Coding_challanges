package b_Easy;

/*
Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).

Examples
formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"
formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"
formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"

Notes
Don't forget the space after the closing parenthesis.
 */
public class E_018 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};

        System.out.println(print(arr));
    }
    static String print(int [] nums){


return "(" + nums[0] + nums[1] + nums[2] + ") " + nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7] + nums[8] + nums[9];

    }
}

