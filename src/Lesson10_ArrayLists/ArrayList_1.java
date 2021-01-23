package Lesson10_ArrayLists;

import Lesson6_ForLoop.ForLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import Lesson6_ForLoop.ForLoop;

/*
- How to define an ArrayList?
- ArrayList vs array
- ArrayList methods
 */
public class ArrayList_1 {
    /*
    array
    1) declaration: String[] strArr
    2) in declaration we need to know the length/size
    3) Size is fixed(cannot change)
    4) works really fast
    5) takes less memory
    7) can store primitive and reference type variables
    8) can be multidimensional

    ArrayList
    1) declaration: ArrayList<String> arrayList;
    2) we do not have to define the initial size
    3) Size is dynamic (can vary)
    4) works much slower than an array
    6) takes more memory than array
    7) can not store primitive type data
    8) can only be one dimensional

     */

    public static void main(String[] args) {

//        Integer[] integers = new Integer[5];
//        System.out.println(integers[0]);  // prints null
//
//        int[] ints = new int[5];
//        System.out.println(ints[0]);   // prints 0
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Veli");
        names.add("Fatma");
        names.add("John");
        names.add(2, "Hacer");
        names.add(3, "Veli");

        System.out.println(names);

//        ArrayList names2 = new ArrayList();
//        names2.add("Veli");
//        names2.add("John");
//        names2.add("Mahmut");


//        names.retainAll(names2);
//        System.out.println(names2);
//        System.out.println("It contains: " + names.contains("Ali"));

//        names.remove("John");
//        names.remove("Michael");
//        System.out.println(names.lastIndexOf("Veli"));

        names.set(3, "Songul");

        names.toArray();

        Collections.sort(names);

        System.out.println(names);

        System.out.println(names.get(5));
    }
}
