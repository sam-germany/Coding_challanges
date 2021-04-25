package a_Very_Easy;/*
Given an object containing counts of both up-votes and down-votes, return what vote
count should be displayed. This is calculated by subtracting the number of down-votes from up-votes.

Examples

getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0

Notes
You can expect only positive integers for vote counts.
 */

public class Easy_012 {

    public static void main(String[] args) {


        System.out.println(print( 2,33 ));
    }

    static  int print(int a, int b){

        return    a - b ;

    }
}
