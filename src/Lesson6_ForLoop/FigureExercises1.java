package Lesson6_ForLoop;

public class FigureExercises1 {


    public static void main(String[] args) {

/*//        *
//          **
//          ***
//          ****
//          *****
        for (int row = 1; row <= 5; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



//        System.out.println();


/*
 *****
 ****
 ***
 **
 *

        for (int row = 5; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
 */


//        System.out.println();



//          *****
//           ****
//            ***
//             **
//              *
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if(col < row)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
