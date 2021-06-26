package b_Easy;
/*
Write a function that returns true if an integer can be expressed as a power of base value 2 and false otherwise.

Examples
powerOfTwo(32) ➞ true
powerOfTwo(1) ➞ true
powerOfTwo(-7) ➞ false
powerOfTwo(18) ➞ false
 */
public class E_092_Find_value_is_Power_of_Two {

    public static void main(String[] args) {

        System.out.println(print(32));
    }

    static  boolean print(int num){

        if(num <=0 ) return  false;

        for(int x=0; x<num; x++){
            if(Math.pow(2,x)== num){
                return  true;
            }
        }
    return false;
    }

    static  boolean print_2(int num){

        while(num > 1  &&    num % 2 == 0){
            num = num/2;
        }
        return  num == 1;            // in the end       2/2 = 1
    }
}

