package Lesson17_Polymorphism;

/*
- what is polymorphism
- Why do we need polymorphism

- overloading methods in the same class
- overloading inherited methods
- in what cases we cannot overload a method?

- overriding inherited methods
- why cannot we override a method in the same class?

- overloading constructors

- Exceptional case: (trying to) overriding a private method of a parent class
- Exceptional case: (trying to) overloading a private method of a parent class (change of return type with the same parameters)

-Exercises???
 */

public class Polymorphism {

    // In Class Method Overloading
    public static int addition(int a, int b){
        return a + b;
    }

    public static void addition(int a, int b, int c){
        System.out.println( a + b + c);
    }

    public static void addition(int age, String name){
        System.out.println(name + "is " + age + " years old.");;
    }

    public static void addition( String name, int age){
        System.out.println(name + "is " + age + " years old.");;
    }

    public static void main(String[] args) {
        System.out.println( addition(5, 6) );

        addition(5, 6, 12);
    }
}
