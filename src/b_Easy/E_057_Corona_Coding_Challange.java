package b_Easy;
/*
Given the number of people that recover per day recovers, the number of new cases per day newCases, and the number of currently active cases activeCases,
write a function to calculate the  number of days needed to reach zero active cases.

Examples
endCorona(4000, 2000, 77000) ➞ 39
endCorona(3000, 2000, 50699) ➞ 51
endCorona(30000, 25000, 390205) ➞ 79

Notes
The number of people who recover per day recovers will always be greater than daily newCases.
Be conservative and round up the number of days needed.
 */
public class E_057_Corona_Coding_Challange {

    public static void main(String[] args) {

        System.out.println(print_2(30000, 25000, 390205));
    }
//Case-1
    static int  print(int recovers, int newCases, int activeCases){

          double remainingCasesPerDay =  recovers - newCases;

        System.out.println(remainingCasesPerDay);

        return (int)Math.ceil(activeCases /remainingCasesPerDay);
    }

/*
Note: first we have to find the average recover cases per day,   as 4000 are recovering but 2000 are new coming
so we make minus  4000-2000 = 2000     so 2000 is the daily patients that we can minus, after that we will divide
the  activeCases / 2000    we will get the end result.
 */

//Case-2
     static int  print_2(int recovers, int newCases, int activeCases){

         int counter = 0;

          while(activeCases  >=0){
              activeCases = activeCases - recovers;
              activeCases = activeCases + newCases;
              counter++;
          }

       return counter;
}
}
/*
This is very simple example on every iteration of we are counting one day

  activeCases = activeCases - recovers;      <-- every day  we are doing minus   recovers  into activeCases

  activeCases = activeCases + newCases;     <-- here we are adding newCases into activeCases

easy to understand
 */

