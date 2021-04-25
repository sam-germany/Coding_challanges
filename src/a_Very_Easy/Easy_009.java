package a_Very_Easy;

/*
You are counting points for a basketball game, given the amount of 2-pointers scored
 and 3-pointers scored, find the final points for the team and return that value.

Examples

points(13, 12) ➞ 62
points(17, 12) ➞ 70
points(38, 8) ➞ 100
 */
public class Easy_009 {

    public static void main(String[] args) {
        System.out.println(print(17,12));
    }

    static  int print(int a, int b){

        return   (a* 2)+ (b*3) ;
    }
}
