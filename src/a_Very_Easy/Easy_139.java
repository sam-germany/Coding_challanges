package a_Very_Easy;

/*
Create a function that counts how many D's are in a sentence.

Examples
countDs("My friend Dylan got distracted in school.") ➞ 4
countDs("Debris was scattered all over the yard.") ➞ 3
countDs("The rodents hibernated in their den.") ➞ 3

Notes
Your function must be case-insensitive.
 */
public class Easy_139 {

    public static void main(String[] args) {

        System.out.println(print("My friend Dylan got distracted in school."));

        System.out.println(print22("My friend Dylan got distracted in school."));
    }

    static int print(String str){

        int cc = (int)str.chars().filter(x -> {
                                         if(x =='d' || x== 'D') {
                                                    return true;
                                                }else  return false;
                                         }).count();

        return cc;
    }


    static int print22(String str){

       int count = 0;
       char[] ch = str.toLowerCase().toCharArray();

       for(int x=0; x< ch.length; x++){

           if(ch[x] == 'd') count++;
       }

       return count;
    }
}
