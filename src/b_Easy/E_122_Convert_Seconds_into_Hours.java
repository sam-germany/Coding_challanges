package b_Easy;
/*
Write a function that takes the number of seconds and returns the digital format clock time as a string.
 Time should be counted from 00:00:00.

Examples
digitalClock(5025) ➞ "01:23:45"
// 5025 seconds is 1 hour, 23 mins, 45 secs.

digitalClock(61201) ➞ "17:00:01"
// No AM/PM. 24h format.

digitalClock(87000) ➞ "00:10:00"
// It's 00:10 next day.
Notes
seconds is always greater than or equal to 0.
 */
public class E_122_Convert_Seconds_into_Hours {

    public static void main(String[] args) {

        System.out.println(print(5025));
    }

    static  String print(int seconds){

        System.out.println(seconds / 3600);
        System.out.println(1425 / 60);
        System.out.println(seconds % 60);

        int hours = (seconds / 3600) % 24;
        int minutes = (seconds % 3600) / 60;
        int left = (seconds % 60);

        return String.format("%02d:%02d:%02d", hours, minutes, left) ;
    }
}
/*
 int hours = (seconds / 3600) % 24;         (5025 / 3600) = 1       (1 % 24)  = 1

                                     in this step we are taking out  the hours from the seconds,    (60 sec * 60  = 3600)
                                     from here we get the 3600, we get the hour, if hour is above 24  then
                                     "1 % 24"    is  "25 % 24  = 1"  as we are checking here only values under 24 hours
                                     so  1 day and hours


 int minutes = (seconds % 3600) / 60;       (5025 % 3600) = 1425    (1425 / 60)  = 23

                  (5025 % 3600) = 1425  <-- with this we are getting reminder, this reminder we will get is the rest part
                                           after doing  minus  with hours, it means this part have minutes and seconds.

  int left = (seconds % 60);                (5025 % 60) = 45

                                            here we are getting reminder, the logic behind is that every hour is having 60 min
                                            and every min is having  60 second , so at the time of Dividing with 60 here it
                                            will remove all the hours and minutes from here and at the end rest Second will
                                            be returned.



 */


