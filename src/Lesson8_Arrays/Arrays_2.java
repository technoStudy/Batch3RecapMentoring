package Lesson8_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays_2 {
    public static void main(String[] args) {
        /*
        - enhanced for loop
        - printing all the elements of an array (use enhanced for loop)
        - clone() and equals() methods
         */

        int[] nums = {12, 56, 98, 3, 0};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        System.out.println();

        for (int num : nums) {
            System.out.print(num + ", ");
        }

        System.out.println("\n---------------");
        String[] names = {"Ali", "Veli", "Deli", "Zeki"};

        for (String name : names) {
            System.out.print(name + ", ");
        }

    }
}
