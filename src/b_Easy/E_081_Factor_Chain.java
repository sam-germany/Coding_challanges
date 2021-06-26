package b_Easy;
/*
A factor chain is an array where each previous element is a factor of the next
consecutive element. The following is a factor chain:

[3, 6, 12, 36]

// 3 is a factor of 6
// 6 is a factor of 12
// 12 is a factor of 36
Create a function that determines whether or not an array is a factor chain.

Examples
factorChain([1, 2, 4, 8, 16, 32]) ➞ true
factorChain([1, 1, 1, 1, 1, 1]) ➞ true
factorChain([2, 4, 6, 7, 12]) ➞ false
factorChain([10, 1]) ➞ false

https://www.mathsisfun.com/numbers/factors-multiples.html

 Note: meaning of Factor chain is the next variable the result after multiplying any 2 digits of last,
       press the link for more understanding.
 */
public class E_081_Factor_Chain {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4, 8, 16, 32};
        System.out.println(print(arr));
    }

    static boolean print(int[] arr) {

        for (int x = 1; x < arr.length; x++) {

            if(arr[x] % arr[x-1] != 0)  return  false;

        }
        return true;
    }
}

