package Lesson5_ScannerAndRandom;

import java.util.Random;

public class RandomEx1 {
    /*
    In a school lottery, all the 200 tickets numbered from 0 - 199 are sold.
    Now it is time to determine the winner!
    Write a program to generate a random number between 0 - 199 and print it on the console.
     */

    public static void main(String[] args) {
        Random winnerTicketNo = new Random();
        int num = winnerTicketNo.nextInt(200);  // a random number between 0(inclusive) and boundary(exclusive)
        System.out.println("Winning ticket is .............. " + num);
    }
}
