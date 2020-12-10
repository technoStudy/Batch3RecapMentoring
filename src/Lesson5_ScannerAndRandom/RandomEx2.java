package Lesson5_ScannerAndRandom;

import java.util.Random;

public class RandomEx2 {
    /*
    num1 --> Generate a random number between 0 and 99.
    num2 --> Generate a random number between 0 and 100.
    num3 --> Generate a random number between 1 and 100.
    num4 --> Generate a random number between 65 and 115.
     */

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Random rdm = new Random();

        num1 = rdm.nextInt(100);  // 0 and 99
        num2 = rdm.nextInt(101);  // 0-100
        num3 = 1 + rdm.nextInt(100);  //  1 and 100
        num4 = 65 + rdm.nextInt(51);     //  0 and 50 ---add 65---> 65 and 115

        /*
        to generate a random number between min and max
        int randomNumber = min +rdm.nextInt(max - min + 1)
         */


    }

}
