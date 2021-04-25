package a_Very_Easy;
/*
A decimal number can be represented as a sequence of bits. To illustrate:

6 = 00000110
23 = 00010111
From the bitwise representation of numbers, we can calculate the bitwise AND, bitwise OR and bitwise XOR.
 Using the example above:

bitwiseAND(6, 23) ➞ 00000110
bitwiseOR(6, 23) ➞ 00010111
bitwiseXOR(6, 23) ➞ 00010001

Write three functions to calculate the bitwise AND, bitwise OR and bitwise XOR of two numbers.

Examples
bitwiseAND(7, 12) ➞ 4
bitwiseOR(7, 12) ➞ 15
bitwiseXOR(7, 12) ➞ 11
 */

public class Easy_115_Bitwise_operator {

    public static void main(String[] args) {

        System.out.println(print(10, 4));
    }

    static boolean print( int a, int b){

// bitwiseAND
     int result_1 = a & b;

// bitwiseOR

     int result_2 = a | b;

// bitwiseXOR

     int result_3 = a ^ b;

        return false;
        }
    }

// just for understanding i wrote these example like this, normally we should create separate methods for every one
