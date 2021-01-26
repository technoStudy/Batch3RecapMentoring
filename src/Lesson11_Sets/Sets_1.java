package Lesson11_Sets;

/*
- Sets vs ArrayList
- HashSet, LinkedHashSet, TreeSet
- add() vs addAll()
 */

import java.util.*;

public class Sets_1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(18);
        myList.add(33);
        myList.add(50);
        myList.add(5);
        myList.add(6);
        myList.add(5);
        myList.add(9);
        myList.add(6);
        myList.add(0);
        myList.add(5);

        Set<Integer> mySet = new HashSet<>(myList);

        System.out.println("My set is: " + mySet);
        System.out.println("My list is: " + myList);

    }
}
