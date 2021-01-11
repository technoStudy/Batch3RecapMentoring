package Lesson8_Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
//        - How to declare two or more dimensional arrays (in different ways)

        int[][] arrays2 = new int[4][];

        int[][] arrays = {
                {1, 5, 8},
                {14, 59, 48, 89, 0},
                {10, 85, 78, 3},
                {1, 25}
        };

//        - Given a 2D-array, print a specific element in the arrays
        System.out.println(arrays[1][3] == 89);  // true

//        - Given a 3D-array, print some specific elements
        int[][][] intArrays = {
                {{1}, {}, {8, 9}},
                {{7, 7}, {1, 2, 5}}
        };

        System.out.println(intArrays[1][1][1] == 2);  // true
        System.out.println(intArrays[0][2][1] == 9);  //true

//        - Given a 2D-array, change the places of specific elements in the arrays
        int temp = arrays[1][4];  // temp = 0
        arrays[1][4] = arrays[3][1];  // arrays[1][4] = 25
        arrays[3][1] = temp; //  arrays[3][1] = 0

        // print arrays
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }


//        - Given a 3D-array, change the places of specific elements in the arrays



    }
}
