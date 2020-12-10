package Lesson5_ScannerAndRandom;

// Scanner class is used to read data from an input device or environment

import java.util.Scanner;

public class ScannerClassEx1 {
    /*
    Let user enter his/her name
    Reply back to the user as "Welcome, <userName>!"
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Welcome, " + name + "!");
    }
}
