package b_Easy;
/*
Write a function that removes any non-letters from a string, returning a well-known film title.

Examples
lettersOnly("R!=:~0o0./c&}9k`60=y") ➞ "Rocky"
lettersOnly("^,]%4B|@56a![0{2m>b1&4i4") ➞ "Bambi"
lettersOnly("^U)6$22>8p).") ➞ "Up"
 */
public class E_100_replaceAll_regex {

    public static void main(String[] args) {

        System.out.println(print("R!=:~0o0./c&}9k`60=y"));
    }

    static  String print(String str){

        return str.replaceAll("[a-zA-Z]", "");

    }
}

