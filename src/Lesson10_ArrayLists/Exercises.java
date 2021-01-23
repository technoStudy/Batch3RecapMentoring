package Lesson10_ArrayLists;

import java.util.Arrays;
import java.util.List;

public class Exercises {

/*
1 - Capitalize the first letters of a given sentence.

2 - Randomly create ten numbers. Create two arraylists called evenNumbers and oddNumbers.
    If the number is even, store it in evenNumbers and if it is odd then store it in oddNumbers.
 */


    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps over the lazy dog.";

        String[] words = sentence.split(" ");

        List<String> wordsList = Arrays.asList(words);

        for (String word : wordsList) {

        }

    }
}
