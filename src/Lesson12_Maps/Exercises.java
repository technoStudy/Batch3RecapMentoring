package Lesson12_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
        for (int i = 1; i <= 30; i++) {
            digits.add(new Random().nextInt(10));
        }
        System.out.println(digits);


        HashMap<Integer, Integer> digitMap = new HashMap<>();
        for (Integer digit : digits) {
            if (digitMap.containsKey(digit)) {
                int newCount = digitMap.get(digit) + 1;
                digitMap.put(digit, newCount);
            } else {
                digitMap.put(digit, 1);   // 5=1, 0=1, 1=4, 3=2, 7=1, ...
            }
        }
        System.out.println(digitMap);

        int maxFrequency = 0;
        for (Integer frequency : digitMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        System.out.println("Max frequency: " + maxFrequency);

        System.out.print("Most repeated digit(s): ");
        for (Integer digit : digitMap.keySet()) {
            if (digitMap.get(digit) == maxFrequency) {
                System.out.print(digit + " ");
            }
        }

//        System.out.println(digitMap.keySet());
//        System.out.println(digitMap.values());


        System.out.println("\n-------------  Ex 2 --------------------");
//        - Given the Map of some numbers and their frequency (the number of times each repeats).
//        Find the average(mean) of the numbers.
        //  average = total of the digits / numbers of digits

        int numberOfDigits = 0;
        int sumOfDigits = 0;
        for (Integer frequency : digitMap.values()) {
            numberOfDigits += frequency;
        }

        for (Integer digit : digitMap.keySet()) {
            sumOfDigits += digit * digitMap.get(digit);
        }
        System.out.println("average of the numbers is: " + (double)sumOfDigits/numberOfDigits);

        System.out.println("\n------------------- Ex 3 ---------------------------");
//        - Given a Map of students with their student IDs and corresponding families. The school wants to send
//        celebration cards to EACH parent. Write a method (accepting the Map) to calculate (returns) number of families.

        HashMap<Integer, String> familyMap = new HashMap<>();
        familyMap.put(108, "Karaca");
        familyMap.put(105, "Karaca");
        familyMap.put(102, "Ustun");
        familyMap.put(109, "Ustun");
        familyMap.put(115, "Demirkiran");
        familyMap.put(205, "Hak");
        familyMap.put(245, "Yorulmaz");
        familyMap.put(265, "Yorulmaz");
        familyMap.put(208, "Yorulmaz");

//        System.out.println(familyMap);

        familyMap.values();
        System.out.println("Total number of families: " + familyCount(familyMap));

    }

    public static int familyCount(HashMap<Integer, String> map){
        HashSet<String> familySet = new HashSet<>(map.values());
        return familySet.size();
    }
}
