package Lesson3_Operators;

public class ArithmeticOperators {
    //  *, /, %,
    //  +, -,

/*
- order of operations
- modulus operator %
- using parenthesis
- using + with String
- dividing int values
- numeric promotion
-Numeric Promotion Rules
    1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
    2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.
    3. Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator,
       even if neither of the operands is int. Unary operators are excluded from this
    rule. For example, applying ++ to a short value results in a short value.
    4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.
 */

    public static void main(String[] args) {
        int num = 2 + 3 * 4;  // 14
        num = (2 + 3) * 4;   // 20

//        int mod = 45 % 7;   // 3
//        System.out.println(num);

//        int number = 9;
//        int number2 = 15;
//        String str = "Hi";
//        System.out.println(number + number2);  // 24
//        System.out.println(number + str);    // 9Hi
//        System.out.println(number + str + number2);   // 9Hi15
//        System.out.println(number + number2 + str);   // 24Hi
//        System.out.println(str + number + number2);   // Hi915
//        String numStr = number2 + ""; //  "15"

        double div = 15/2;
        double div2 = 15 / 2.0;
        System.out.println(div);   // 7.0
        System.out.println(div2);  // 7.5

  //      byte < char < short < int < long < float < double

        short shr1 = 56;
        short shr2 = 4;
        int shortNum = shr1 + shr2;
        short shr = shr2++;
    }
}
