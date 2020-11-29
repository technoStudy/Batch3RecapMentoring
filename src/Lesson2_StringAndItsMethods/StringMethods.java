package Lesson2_StringAndItsMethods;

public class StringMethods {

    public static void main(String[] args) {
/*
String is an class.

Types of data:
 - primitive
 - Reference (pre-defined and user-defined)
 - Arrays
 */

        String str = "Ali has gone to school.";


/*
Some important String methods:
length, charAt, substring, indexOf, lastIndexOf, toLowerCase, toUpperCase,
equals, equalsIgnoreCase, startsWith, endsWith, contains, replace, trim, concat
 */

        System.out.println(str.length());
        str.charAt(6); // prints out "s"
        str.charAt(25); // throws exception


        String str1 = null; // null string
        String str2 = "";  // empty String and str1 is not equal to str2

        //str = "Ali has gone to school."
        str.substring(2, 8);   // "i has "
        str.substring(5);   // "as gone."

        str.indexOf('i');  // 2   you may pass a char value
        str.indexOf("i");  // 2   you may pass a String value
        str.indexOf("i has");  // 2
        str.indexOf("gone");   // 8
        str.indexOf("geno");  // -1   It does not throw exception!
        str.indexOf("o");   // 9  returns the very first one

        str.lastIndexOf('o');  // 20

        str.toLowerCase();   //  "ali has gone to school."
        str.toUpperCase();   //   "ALI HAS GONE TO SCHOOL."










// String class is IMMUTABLE !!!





/*
equals vs ==
 */


    }
}
