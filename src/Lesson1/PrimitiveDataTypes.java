package Lesson1;

// JVM vs JRE vs JDK
/*
JVM: Java Virtual Machine
JRE: Java Runtime Environment
JDK: Java Development Kit

JVM + Other Libraries --> JRE
JRE + Development Tools --> JDK
 */

// creating packages, importing classes, order of elements in a class (package, import, class)

// CompileTimeError vs RuntimeError

// naming identifiers and reserved words, (caseSensitivity)
   /*
   - You may use letter, numbers, $, _ for naming
   - you cannot start with a number
   - you cannot use keywords
   - names are case sensitive
    */

public class PrimitiveDataTypes {

    // declaring multiple variables

    //int num1=2, num2=5, num3;
    // primitive data types and their possible value ranges
//        byte, short, int, long, float, double, char and boolean


    // default values of primitive data types
    // byte, short, int, long --> 0
    // float, double --> 0.0
    // boolean --> false
//  char --> "\u0000" (you do not have to know this


    /*
    Followings are VALID main method declarations:

public static void main(String[] args) {}
static public void main(String[] args) {}
public static void main(String args[]) {}
public static void main(String[] youMayWriteAnyNameHereAndItIsStillmainMethod) {}
public static void main(String... args) {}
     */


    public static void main(String[] args) {
        // variable declaration, assignment and initialization
        int num;  //declaration
        num = 34; // assignment
        int num2 = 12; //initialization

// auto-boxing primitive variables vs parsing primitive types
        // byte < char < short < int < long < float < double,

//        int number = 455465523;
//        short shortNum = (short)number;
//        System.out.println(shortNum);

        int interesting = 't';
        System.out.println(interesting);
    }
}
