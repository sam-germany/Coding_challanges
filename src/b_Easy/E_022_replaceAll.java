package b_Easy;

/*
Write a function that receives two portions of a path and joins them. The portions will be joined with the "/" separator. There could be only one separator and if it is not present it should be added.

Examples
joinPath("portion1", "portion2") ➞ "portion1/portion2"
joinPath("portion1/", "portion2") ➞ "portion1/portion2"
joinPath("portion1", "/portion2") ➞ "portion1/portion2"
joinPath("portion1/", "/portion2") ➞ "portion1/portion2"

Notes
Try not to solve this challenge using only if-else conditions.
 */
public class E_022_replaceAll {

    public static void main(String[] args) {

        System.out.println(print("portion1", "portion2"));
    }

    static  String print(String a, String b){


        return a.replaceAll("/", "") + "/" + b.replaceAll("/", "");

    }
}

