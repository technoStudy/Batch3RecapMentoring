package Lesson2_StringAndItsMethods;

public class StringMethods2 {

    public static void main(String[] args) {
        /*
Some important String methods: (CONTINUED)
equals, equalsIgnoreCase, startsWith, endsWith, contains, replace, trim, concat
 */

        String str1 = "Techno Study";
        String str2 = "teCHNo sTuDY";
//        System.out.println("equals method here --> " + str1.equals(str2));
//        System.out.println("equalsIgnoreCase method here --> " + str1.equalsIgnoreCase(str2));

        str1.startsWith("Tec");   // true
        str1.startsWith("tu", 7);  // false
        str1.startsWith("Stu", 7);  // true

        str1.endsWith("y");  // true
//        str1.endsWith('y');  // compile time error - it does not take char!

        str1.contains("no");  // true

        str1.replace("ech", "AAA"); // "TAAAno Study"
        str1.replace('S', 's'); // "Techno study"
//        System.out.println(str1.replace('T', 't').replace('t', '?')); // "?echno s?udy
//        System.out.println(str1.replace("z", "y")); // "Techno Study"

        String str3 = "    some      text here    ";
        str3.trim();  // "some      text here"

        String str4 = " is cool!";
        str1.concat(str4);  // "Techno Study  is cool!"
//        str1 + str4;  // using + is not a good practice of adding Strings!


// String class is IMMUTABLE !!!

        String word1 = "Techno";
        word1.concat("Study");
//        System.out.println(word1);  // "Techno"
        word1 = word1.concat("Study");
//        System.out.println(word1);  // "TechnoStudy"

/*
equals vs ==
 */
        String word2 = "Techno".concat("Study");
        String word3 = "Techno".concat("Study");

//        System.out.println(word2.equals(word3));  // true equal() checks value equality
//        System.out.println(word2 == word3);  // true  == checks object equality

        String s1 = "Hi";
        String s2 = new String(s1);

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);  // false

    }
}
