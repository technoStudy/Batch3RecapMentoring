package Lesson7_WhileLoop;

import java.util.Scanner;

public class OptionExercise {
    public static void main(String[] args) {
        //        - (Ex about keeping to ask for option unless a valid choice)

        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.print("Please select the number of your option: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        while(option < 1 || option > 3) {
            System.out.println("This is an invalid option number.");
            System.out.print("Please select the number of your option: ");
            scanner = new Scanner(System.in);
            option = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Thank you for selecting the option " + option);

    }
}
