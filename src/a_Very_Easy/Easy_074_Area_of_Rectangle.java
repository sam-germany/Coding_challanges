package a_Very_Easy;


public class Easy_074_Area_of_Rectangle {

    public static void main(String[] args) {

        System.out.println(print(10, 1000));
    }

    static  int print(int height, int width){

        return  height <=0 || width <=0 ?  -1 : height * width ;
    }
}
