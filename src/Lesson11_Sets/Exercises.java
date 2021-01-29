package Lesson11_Sets;

import java.util.*;
import java.util.function.Predicate;

public class Exercises {
    /*


    - write a method which calculate how many different letters a word contains
    - write a method which takes an ArrayList and returns a boolean that if the ArrayList has a repeating element
     */

    public static void main(String[] args) {
//        - Create a set of place names. If the set has "Ohio" remove it from the set,if not add it to the set.
        HashSet<String> placeNames = new HashSet<>();
        placeNames.add("New York");
        placeNames.add("Texas");
        placeNames.add("North Caroline");
        placeNames.add("New Jersey");
        placeNames.add("New Orleans");
        placeNames.add("Maine");

        System.out.println(addRemoveOhio(placeNames));
        System.out.println(addRemoveOhio(placeNames));

        System.out.println(removeStatesStartingNew(placeNames));

    }

    public static Set<String> addRemoveOhio(Set<String> placeNames) {
        if (placeNames.contains("Ohio")) {
            placeNames.remove("Ohio");
        } else {
            placeNames.add("Ohio");
        }
        return placeNames;
    }


    //    - Create a set of place names. Delete all places whose name starts with "New".
    public static HashSet<String> removeStatesStartingNew(HashSet<String> placeNames) {

        ArrayList<String> placeList = new ArrayList<>();
        for (String place : placeNames) {
            if(place.startsWith("New")){
               placeList.add(place);
            }
        }
        placeNames.removeAll(placeList);

        return placeNames;
    }

}
