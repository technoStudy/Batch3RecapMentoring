package Lesson12_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Exercises {
    /*
    - Given the Map of some numbers and their frequency (the number of times each repeats).
      Find the average(mean) of the numbers.

    - Given a Map of students with their student IDs and corresponding families. The school wants to send
      celebration cards to EACH parent. Write a method (accepting the Map) to calculate (returns) number of families.
     */

    public static void main(String[] args) {
//        - Create an ArrayList of 30 one-digit-numbers (0-9) which are randomly created.
//        Find the most repeated digit (the "mode" of the collection)
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
          digits.add(new Random().nextInt(10));
        }
        System.out.println(digits);


        HashMap<Integer, Integer> digitMap = new HashMap<>();
        for (Integer digit : digits) {
            if(digitMap.containsKey(digit)){
                int newCount = digitMap.get(digit)+1;
                digitMap.put(digit, newCount);
            } else {
                digitMap.put(digit,1);   // 5=1, 0=1, 1=4, 3=2, 7=1,
            }
        }
        System.out.println(digitMap);




        System.out.println("Most repeated digit is: ");
    }
}
