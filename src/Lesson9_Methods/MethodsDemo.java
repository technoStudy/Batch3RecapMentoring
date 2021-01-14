package Lesson9_Methods;

        /*
        - why do we need methods
        - method signature
        - return types and parameters combination
        - parameter vs arguments
        - "pass-by-value" principal
        - some simple method exercises
         */

public class MethodsDemo {

    public static void main(String[] args) {
        addNumber(15,10);
    }


    public static void addNumber(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }


}
