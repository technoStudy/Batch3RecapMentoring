package Lesson6_ForLoop;

import java.util.Arrays;

public class NestedForLoops {
    public static void main(String[] args) {
        /*
- Labeling loops and using break statement with labels
 */

/*         - print all the prime numbers less than a given number (inclusive)
        int num = 9;
        if(num >= 2) {
            System.out.print("2, ");
        }
        for (int i = 3; i <= num; i++) {
            int number = i;

            boolean isPrime = true;
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + ", ");
            }
        }*/


/*        //     - print all the possible letter pairs by using the letters a, b, c and d
        for (char row = 'a'; row <= 'd' ; row++) {
            for (char col = 'a'; col <='d' ; col++) {
                System.out.print(String.valueOf(row) + col + " ");
            }
            System.out.println();
        }*/

/*//print all the possible number pairs by using numbers between 1 and 5 (inclusive)
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j < 6 ; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }*/

//    print all the possible number pairs by using numbers between 1 and 5 (inclusive)
//    where second number is bigger than the first number of the pair.

/*//        1st way:
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                if(j > i)
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
//        2. way: (Preferred solution)
         for (int i = 1; i <= 5 ; i++) {
            for (int j = i+1; j <= 5 ; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }*/


/*// Labeling loops and using break statement with labels
        Distaki : for (int i = 1; i <= 5 ; i++) {
            icteki: for (int j = i+1; j <= 5 ; j++) {
                if(i == 2 && j == 4){
                    break Distaki;
                }
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }*/

    }
}
