package Lesson9_Methods;

public class MethodExercise2 {

    // Write a method that takes int inch and returns double cm value
    public static double inchToCm(int inch) {
        return inch * 2.5;
    }

    // Write a method that takes two int parameters of feet and inch and returns int inch value
    public static int feetAndInchToInch(int feet, int inch) {
        return feet * 12 + inch;
    }

    // Write a method that takes two int parameters of feet and inch and returns double cm value
    public static double feetAndInchToCm(int feet, int inch) {
        int totalInch = feetAndInchToInch(feet, inch);
        return inchToCm(totalInch);
    }


    public static void main(String[] args) {
//        int inch = 15;
//        System.out.println(inch + " is equal to " + inchToCm(inch) + " cm");

        int feet = 5;
        int inch = 7;
        System.out.println(feetAndInchToCm(feet,inch));
    }
}
