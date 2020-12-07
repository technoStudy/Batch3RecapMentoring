package Lesson4;

// Structure of switch statement

public class SwitchStatementEx1 {

    public static void main(String[] args) {
        /*
Write a program for a blind person that speaks out the digit pressed.
A digit is defined as a number with only one character
(For simplicity of the program it just writes on the console)

3 -> "Three" is printed on the console
4 -> "Four" is printed on the console
15 - "Not a valid digit"
         */

        int key = 7;

        /*
        if (key == 0) {
            System.out.println("Zero");
        }
        if (key == 1) {
            System.out.println("One");
        }
        if (key == 2) {
            System.out.println("Two");
        }
        if (key == 3) {
            System.out.println("Three");
        }
        if (key == 4) {
            System.out.println("Four");
        }
        if (key == 5) {
            System.out.println("Five");
        }
        if (key == 6) {
            System.out.println("Six");
        }
        if (key == 7) {
            System.out.println("Seven");
        }
        if (key == 8) {
            System.out.println("Eight");
        }
        if (key == 9) {
            System.out.println("Nine");
        }
*/
switch(key){
    case 0:
        System.out.println("Zero");
        break;
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
    case 4:
        System.out.println("Four");
        break;
    case 5:
        System.out.println("Five");
        break;
    case 6:
        System.out.println("Six");
        break;
    case 7:
        System.out.println("Seven");
        break;
    case 8:
        System.out.println("Eight");
        break;
    case 9:
        System.out.println("Nine");
        break;
    default:
        System.out.println("Not a valid digit.");
}



    }  // end of main method
} // end of class
