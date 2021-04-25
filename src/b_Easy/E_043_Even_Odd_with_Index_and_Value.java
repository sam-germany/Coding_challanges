package b_Easy;
/*
An array is special if every even index contains an even number and every odd index contains an odd number.
 Create a function that returns true if an array is special, and false otherwise.

Examples
isSpecialArray([2, 7, 4, 9, 6, 1, 6, 3]) ➞ true
// Even indices: [2, 4, 6, 6]; Odd indices: [7, 9, 1, 3]

isSpecialArray([2, 7, 9, 1, 6, 1, 6, 3]) ➞ false
// Index 2 has an odd number 9.

isSpecialArray([2, 7, 8, 8, 6, 1, 6, 3]) ➞ false
// Index 3 has an even number 8.
 */
public class E_043_Even_Odd_with_Index_and_Value {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 9, 1, 6, 1, 6, 3};
        System.out.println(0%2);
        System.out.println(1%2);

        System.out.println(print(arr));
    }                                  // all the Steps
                                          //    (0 % 2 != 2 % 2)
    static boolean print(int [] arr){     //    (1 % 2 != 7 % 2)
                                          //    (2 % 2 != 9 % 2)
        for(int x=0;x<arr.length;x++) {   //    (3 % 2 != 1 % 2)
                                          //    (4 % 2 != 6 % 2)
            if (x % 2 != arr[x] % 2) {    //    (5 % 2 != 1 % 2)
                return  false;            //    (6 % 2 != 6 % 2)
            }                             //    (7 % 2 != 3 % 2)
        }                                 //
        return  true;                     // it checks both  Index and value in a tricky way easy to understand
    }



    static  boolean print_2(int [] arr){

        for(int x=0; x<arr.length; x++){
            if(x%2==0){
               if (arr[x] % 2 !=0) return  false ;
            }

            if(x%2 !=0){
                if (arr[x] % 2==0) return  false ;
            }
        }

        return true;
    }
}

