package Lesson4;

// Structure of if-else-if statements
/*
if statement:
    if(true)  --> runs if statement
    if(false) --> skips the if statement

if-else statement
    if(true) --> runs if statement
    if(false) --> runs else statement

else statement is optional

 */
public class IfElseStatements_Ex1 {
    public static void main(String[] args) {

/*
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"
*/

/*
weekday and no holiday --> 7:00
weekday and holiday --> 10:00
weekend and no holiday --> 10:00
weekend and holiday --> off
 */
// Shot keys:  ctrl + alt + l  --> formats your code
        boolean isHoliday = false;
        int day = 1;

        //checking if weekend
        if (day == 0 || day == 6) {  // if weekend
            if (isHoliday) {  // is weekend and holiday
                System.out.println("off");
            } else { // is not a holiday
                System.out.println("10:00");
            }

        } else { // else it is weekday
            if (isHoliday) { // weekday and holiday
                System.out.println("10:00");
            } else{ // weekday and not holiday
                System.out.println("7:00");
            }
        }

    }
}
