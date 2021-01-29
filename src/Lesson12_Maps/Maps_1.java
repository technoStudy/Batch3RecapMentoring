package Lesson12_Maps;

import java.util.*;

public class Maps_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101,"Ali Degerli");
        students.put(102,"Veli Degerli");
        students.put(103,"Zeki");
        students.put(104, null);
        students.put(110, "Zeki");

//        System.out.println(students);
//        System.out.println(students.get(103));

        Collection<String> studentNames = students.values();
        System.out.println(studentNames);

        Set<Integer> studentIDs = students.keySet();
        System.out.println(studentIDs);


    }
}
