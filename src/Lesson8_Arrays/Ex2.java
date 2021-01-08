package Lesson8_Arrays;

public class Ex2 {
    /*

    Exercise:   Rewrite the elements of an int array in ascending order
                [5, 14, 0, 9, -2, 1, 11, 5, 249, 9] --> [-2, 0, 1, 5, 5, 9, 9, 11, 14, 249]
     */

    public static void main(String[] args) {

//            Exercise:   Given a non-empty array of ints.
//                a) print true if first or second element is 6

        int[] nums = {6, 1, 8, 0};
        System.out.println(nums[0] == 6 || nums[1] == 6);

        //   b) print true if first and last elements are equal
        System.out.println(nums[0] == nums[nums.length - 1]);


//        Exercise:   Given an array with three city names.
//                Create another array having these city names in the reverse order of the given array
//                [Ohio, Texas, New York]  -->  [New York, Texas, Ohio]

        String[] cities = {"Ohio", "Texas", "New York", "New Jersey"};
        int len = cities.length;
        String[] citiesReverse = new String[len];

        for (int i = len - 1; i >= 0; i--) {
            citiesReverse[i] = cities[len - 1 - i];
        }

        for (String s : citiesReverse) {
            System.out.print(s + ", ");
        }
        System.out.println("\n----------------");



//        Exercise:   Create an array of char having the letters of a given String.
//        Techno Study --> [T, e, c, h, n, o, , S, t, u, d, y]
        String name = "Techno Study";
        char[] letters = new char[name.length()];  // name.length() == chars.length

        for (int i = 0; i < name.length(); i++) {
            letters[i] =name.charAt(i);
        }

        for (char letter : letters) {
            System.out.print(letter + ", ");
        }


//        Exercise:   Rewrite the elements of an int array in ascending order
//         Output sample:       [5, 14, 0, 9, -2, 1, 11, 5, 249, 9] --> [-2, 0, 1, 5, 5, 9, 9, 11, 14, 249]

//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }


    }
}
