package a_Very_Easy;

/*
Create a method that returns the number of frames shown in a given number of minutes for a certain FPS.

Examples
frames(1, 1) ➞ 60

frames(10, 1) ➞ 600

frames(10, 25) ➞ 15000
Notes
FPS stands for "frames per second" and it's the number of frames a computer screen shows every second.
* */
public class Easy_030 {

    public static void main(String[] args) {

        System.out.println( print(10,25));
    }

    static int print(int a, int b){
 
        return  a * (b *60);
    }

}
