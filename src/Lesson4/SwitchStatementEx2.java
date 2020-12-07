package Lesson4;

public class SwitchStatementEx2 {
    public static void main(String[] args) {
        /*
        Choice checker:
        In a multiple-choice test, there are 5 choices for each question, say A, B, C, D, E
        Print "Congrats. Correct answer!" if the answer is correct.
        Print "Sorry, it is not correct." if the answer is wrong.
        Print "Invalid choice" for any other case.
         */
        String selection = "B";

            switch (selection) {
                case "A":
                    System.out.println("Congrats. Correct answer!");
                    break;
                case "B":
                case "C":
                case "D":
                case "E":
                    System.out.println("Sorry, it is not correct.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
    }

}
