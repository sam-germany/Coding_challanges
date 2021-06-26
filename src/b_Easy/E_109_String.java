package b_Easy;
/*
Create a function that returns the selected filename from a path including the file extension.

Examples
getFilename("C:/Projects/pil_tests/ascii/edabit.txt") ➞ "edabit.txt"
getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3") ➞ "Beethoven_5.mp3"
getFilename("ffprobe.exe") ➞ "ffprobe.exe"

Notes
Tests will include both absolute and relative paths.
For simplicity, all paths will only include forward slashes.
 */
public class E_109_String {

    public static void main(String[] args) {

        System.out.println(print("abc/def/ghij/aa.txt"));
    }

    static  String print(String str){

        return str.substring(str.lastIndexOf("/") +1);
    }

    static  String print_2(String str){

        String [] arr = str.split("/");

        return  arr[arr.length-1];
    }

}

