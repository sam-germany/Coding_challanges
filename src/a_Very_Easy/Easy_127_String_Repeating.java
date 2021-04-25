package a_Very_Easy;


public class Easy_127_String_Repeating {

    public static void main(String[] args) {

        System.out.println(print("abc", 5));
    }

    static  String print(String str, int num){

        if(str instanceof  String){
            String s= "";

            for(int x=0; x < num; x++){
            s = s + str;
            }
            return s;
        }
        return "Not a String";
    }
}
