package a_Very_Easy;

/*
As you complete challenges on Edabit, you gain experience points depending on the level of difficulty of the challenge. The points for each level of difficulty are as follows:

Difficulty	Experience Points
Very Easy	5XP
Easy	10XP
Medium	20XP
Hard	40XP
Very Hard	80XP
Given an array of how many challenges a person has completed per level of difficulty, return how many experience points they'll have.

Examples
getXP([89, 77, 30, 4, 1]) ➞ "2055XP"
// Very Easy: 89 * 5 = 445
// Easy: 77 * 10 = 770
// Medium: 30 * 20 = 600
// Hard: 4 * 40 = 160
// Very Hard: 1 * 80 = 80
// 445 + 770 + 600 + 160 + 80 = 2055

getXP([254, 32, 65, 51, 34]) ➞ "7650XP"

getXP([11, 0, 2, 0, 27]) ➞ "2255XP"
 */
public class Easy_042 {

    public static void main(String[] args) {

        int[] arr = new int []{89, 77, 30, 4, 1};
        System.out.println( print(arr));
    }

    static String  print(int arr []){

        int exp = 0;
        for(int i=0; i< arr.length; i++){
            exp += 5 * arr[i] * Math.pow(2,i);
            System.out.println(exp);
        }

        return   exp+ "XP";
    }

}
/*
        for(int x=0; x< 5;x++) {
            System.out.println(x +"--"+ Math.pow(2, x));          <-- this for loop shows what Math.pow()  return
        }                                                             and how this method actually works
 */
