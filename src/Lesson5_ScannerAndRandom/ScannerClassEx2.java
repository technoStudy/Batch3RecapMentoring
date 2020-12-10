package Lesson5_ScannerAndRandom;

import java.util.Scanner;

public class ScannerClassEx2 {
    /*
    Let user enter his/her user name and pin code.
    If the credentials are correct then welcome the user with his/her name.
    If one of the credentials are wrong, print "You have no access!"
     */

    public static void main(String[] args) {
        String fullName = "John Smith";
        String username = "JSmith";
        int pinCode = 123456;

///////////////// Write your code below this line ////////////////////////
        Scanner s = new Scanner(System.in);

        System.out.print("Your user name: ");
        String userN = s.nextLine();
        System.out.print("Your pin code: ");
        int code = s.nextInt();

        if (userN.equals(username) && code == pinCode) {
            System.out.println("Welcome " + fullName + "!");
        } else {
            System.out.println("You have no access!");
        }

    }

}
