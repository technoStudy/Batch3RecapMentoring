package Lesson7_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int number = randomNumberGenerator();
        game(number);

    }


    public static int randomNumberGenerator() {
        Random random = new Random();
        int num = random.nextInt(101);
        return num;
    }

    public static void game(int number) {

        int counter = 1;

        for (; counter <= 5; counter++) {
            System.out.println("Guess a number between 0 and 100.");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("You got it.");
                break;
            } else if (number > guess) {
                System.out.println("Your number is too low.");
            } else {
                System.out.println("Your number is too high.");
            }
        }

        if (counter > 5) {
            System.out.println("You did not get it, dude!");
            System.out.println("The number was " + number);
        }

    }


}
