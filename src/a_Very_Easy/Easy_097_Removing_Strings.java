package a_Very_Easy;

public class Easy_097_Removing_Strings {

    public static void main(String[] args) {

        System.out.println(print("abcdef"));
    }

    static  String print(String str){

        return   str.length()<=2 ? str : str.substring(1, str.length()-1);
    }
}
