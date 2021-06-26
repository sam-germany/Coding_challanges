package b_Easy;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
public class E_072_Array_substring {

    public static void main(String[] args) {

        String [] arr  = new String[]{"code.html", "code.css"};

                  String [] arr2 =    print(arr);
                  for(String x : arr2){
                      System.out.println(x);
                  }
    }

    static  String [] print(String [] arr){

        for(int x=0; x<arr.length; x++){
            arr[x] = arr[x].substring(arr[x].indexOf(".")+1);
        }

        return arr;
    }



    static  String [] print_1(String [] arr){

        return new String []{ arr[0].substring(arr[0].indexOf("."))+1 , arr[1].substring(arr[1].indexOf("."))+1 };
    }
}

