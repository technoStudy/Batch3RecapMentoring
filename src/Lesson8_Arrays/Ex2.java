package Lesson8_Arrays;

public class Ex2 {
    /*
    Exercise:   Given an array with three city names.
                Create another array having these city names in the reverse order of the given array
                [Ohio, Texas, New York]  -->  [New York, Texas, Ohio]

    Exercise:   Create an array of char having the letters of a given String.
                TechnoStudy --> [T, e, c, h, n, o, S, t, u, d, y]

    Exercise:   Rewrite the elements of an int array in ascending order
                [5, 14, 0, 9, -2, 1, 11, 5, 249, 9] --> [-2, 0, 1, 5, 5, 9, 9, 11, 14, 249]
     */

    public static void main(String[] args) {

//            Exercise:   Given a non-empty array of ints.
//                a) print true if first or second element is 6

        int[] nums = { 6, 1, 8, 0};
        System.out.println(nums[0] == 6 || nums[1] == 6);

        //   b) print true if first and last elements are equal
        System.out.println(nums[0] == nums[nums.length - 1]);
    }
}
