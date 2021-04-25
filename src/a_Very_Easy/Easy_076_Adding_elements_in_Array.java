package a_Very_Easy;


import java.util.Arrays;

public class Easy_076_Adding_elements_in_Array {

    public static void main(String[] args) {

        int[] arr = new int[]{-10, 3 , 0};

        System.out.println(print(arr));
    }

    static  int print(int [] arr){

        return  Arrays.stream(arr).sum();          // really a modern and shortcut way
    }
}
/*
   static  int print(int [] arr){
   int y=0 ;
      for(int x=0; x< arr.length; x++){
       y += arr[x];
      }
        return  y;
    }


 */
