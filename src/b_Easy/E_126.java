package b_Easy;
/*
Parity bits are used as very simple checksum to ensure that binary data isn't corrupted during transit.
Here's how they work:

If a binary string has an odd number of 1's, the parity bit is a 1.
If a binary string has an even number of 1's, the parity bit is a 0.
The parity bit is appended to the end of the binary string.
Create a function that validates whether a binary string is valid, using parity bits.

Examples
validateBinary("10110010") ➞ true
// The last digit is the parity bit.
// 0 is the last digit.
// 0 means that there should be an even number of 1's.
// There are four 1's.
// Return true.

validateBinary("00101101") ➞ true
validateBinary("11000000") ➞ true
validateBinary("11000001") ➞ false

Notes
All inputs will be a byte long (8 characters).
 */
public class E_126 {

    public static void main(String[] args) {

        System.out.println(print("0010110"));
    }

    static  boolean print(String str){

        return (str.replaceAll("0", "").length() & 1) == 0;
    }

    static  boolean print_2(String bits){

        boolean output = false;
        int count = 0;

        String[] result = bits.split("");
        int len = result.length;
        for(int i=0; i<len-1;i++){
            if(result[i].equals("1")){
                count++;
            }
        }

        String lastDigit = result[len-1];
        if(count%2==0&&lastDigit.equals("0")){
            output = true;
        } else if(count%2==0&&lastDigit.equals("1")){
            output = false;
        } else if(count%2==1&&lastDigit.equals("0")){
            output = false;
        }else if(count%2==1&&lastDigit.equals("1")){
            output = true;
        }
        return output;
    }

}

