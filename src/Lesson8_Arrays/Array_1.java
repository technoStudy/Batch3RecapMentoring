package Lesson8_Arrays;

import java.util.Random;

public class Array_1 {
    public static void main(String[] args) {

//        - How do declare/initialize them
//                * We need to know the variable type and length of an array
        // 1st way of initialization
        int[] numbers1 = {1, 5, 0, 48, -7, 5, 8, 1};

        // 2nd way of initialization
        int[] numbers2 = new int[8];
        numbers2[0] = 1;
        numbers2[1] = 5;
        numbers2[2] = 0;
        numbers2[3] = 48;
        numbers2[4] = -7;
        numbers2[5] = 5;
        numbers2[6] = 8;
        numbers2[7] = 1;


//        * initialize an array of letters of your full name
        char[] letters = {'t', 'e', 'c', 'h', 'n', 'o', 's', 't', 'u', 'd', 'y'};


// * initialize an array of boolean with six elements.
        boolean[] bools = {true, false, false, false, true, false};


//                  * initialize an array of positive even numbers less then 21.
        int[] evenNums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

//        (what about less than 201?)
        int[] evenNums2 = new int[100];  // declaration of the array
        for (int i = 0; i < 100 ; i++) {   // populate with elements
            evenNums2[i] = 2*i + 2;
            System.out.print(evenNums2[i] + ", ");
        }

        System.out.println("\n------------------------------");
//      Randomly populate an array of 10 ints with the integers between 0 and 49.
        Random rdm = new Random();
        int[] randomNums = new int[10];

        for (int i = 0; i < 10; i++) {
            randomNums[i] = rdm.nextInt(50);
            System.out.print(randomNums[i] + ", ");
        }
        System.out.println();
//        Add 3rd, 7th and 9th elements and print the sum
//        System.out.println(randomNums[2] + randomNums[6] + randomNums[8]);


//     changing the value of an element
        randomNums[5] = 82;
        for (int i = 0; i < 10; i++) {
            System.out.print(randomNums[i] + ", ");
        }
    }
}
