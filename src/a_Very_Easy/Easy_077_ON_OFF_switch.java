package a_Very_Easy;
/*
Create a function that returns how many possible arrangements can come from a certain number of switches (on / off). In other words, for a given number of switches, how many different patterns of on and off can we have?

Examples
posCom(1) ➞ 2
posCom(3) ➞ 8
posCom(10) ➞ 1024
 */


public class Easy_077_ON_OFF_switch {

    public static void main(String[] args) {

        System.out.println(print(3));
    }

    static  int print(int a){

        return  (int) Math.pow(2, a);
    }
}
