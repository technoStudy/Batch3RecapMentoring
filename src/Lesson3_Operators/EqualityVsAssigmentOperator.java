package Lesson3_Operators;

public class EqualityVsAssigmentOperator {
    /*
    Equality operator is ==  (Note: Remember the difference between == and equal() method)
    vs
    Assignment operator is =
     */

    public static void main(String[] args) {
        String str1 = "Hello".substring(2);  // "llo"
        String str2 = "Hello".substring(2);  // "llo"

        System.out.println(str1 == str2);  // false
        System.out.println(str1.equals(str2)); // true

        int a = 5;
        System.out.println(a);    // 5
        System.out.println( a == 7);   //  false
        System.out.println( a = 7);    //  7
        System.out.println(a);    // 7

    }

    // Equality operator == returns boolean
    // Assignment operator = assigns the value at the right to the left, AND RETURNS THE VALUE



}
