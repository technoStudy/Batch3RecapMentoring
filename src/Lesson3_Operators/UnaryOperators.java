package Lesson3_Operators;

public class UnaryOperators {
    /*
    + (positive), - (negative), ! (logical inversion)
    ++ (pre and post increment), -- (pre and post decrement)
    compound assignment operators (+=, -=, *=, /=, %=, ...)
     */

    public static void main(String[] args) {

        int num = 7;  // num = 7
        //post increment says increase the number by 1 and use the OLD value!!
        System.out.println(num++);  // 7  and num:8
        System.out.println(num);  // 8


        int number = 9;
        System.out.println(++number);  // 10
        // pre increment says increase the number by 1 and use the NEW value!!


        int n = 11;  // n:11
        n += 5;   //  n = n + 5;    --> n:16

        n /= 8;   // n:2

        n *= 3;   //  n = n * 3  --> n:6

        n =+ 9;   //
        System.out.println("----------------");
        System.out.println(n);   // 9
    }
}
