package a_Very_Easy;

/*
Parity bits are used as a very simple checksum to ensure that binary data isn't corrupted during transit. Here's how they work:

If a binary string has an odd number of 1's, the parity bit is a 1.
If a binary string has an even number of 1's, the parity bit is a 0.
The parity bit is appended to the end of the binary string.
Create a function that adds the correct parity bit to a binary string.

Examples
addParityBit("1011011") ➞ "10110111"

// There are five 1's.
// Since five is odd, the parity bit should be a 1.
// Add the parity bit to the end of the string.
// Return the result.

addParityBit("0110000") ➞ "01100000"
addParityBit("0101101") ➞ "01011010"
addParityBit("1111111") ➞ "11111111"

Notes
All inputs will be 7-bits long (so that the parity bit makes it a full byte).
 */
public class Easy_043 {

    public static void main(String[] args) {

        System.out.println( print("01100000"));
    }

    static String  print(String a){

        return  a + a.replace("0", "").length()%2;
    }



/*
   String a = "011100000";
        a = a.replace("0","");

        System.out.println(a.length()%2);          <--easy to understand just check the code like this
 */

}
