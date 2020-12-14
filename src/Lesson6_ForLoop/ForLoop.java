package Lesson6_ForLoop;

/*
- Why do we need loops?
- Structure of a for loop and flow of a for loop
- Examples
    - printing numbers between 1 and 1000
    -printing numbers from 152 to 87
    - printing even numbers between 1 and 101  (different approaches)
- optional parameters and infinite for loop
- for loop with two or more initializer
- keyword break (with an example)
-keyword continue (with an example)
- Some more examples
   - check if a given number is a prime number
   - print all the capital letters of a given string has
- nested loops with examples
    - print all the prime numbers less than a given number
    - print all the possible letter pairs by using the letters a, b, c and d
    - print all the possible number pairs by using numbers between 1 and 5 (inclusive)
      where second number is bigger than the first number of the pair.
- Labeling loops and using break statement with labels
 */

public class ForLoop {
    public static void main(String[] args) {
        /*
        for(initialization; booleanExpression; updateStatement) {
            // Body
        }
         */

//        for(int i = 1; i <= 5; i++){
//            System.out.println("Hello Techno Study.");
//        }

//        for (int number = 1; number <= 1000; number++) {
//            System.out.print(number + ", ");
//        }

//        for (int i = 152; i >= 87; i--) {
//            System.out.println(i);
//        }

//        for( ; ; ){
//            System.out.println("This is an infinite loop!");
//        }

//        for (int i = 2; i <= 100; i+=2) {
//                System.out.print(i + ", ");
//        }

//        for (int a = 0, b = 10; a <= 10 && b >= 0 ;  a++, b--) {
//            System.out.println(a + " + " + b + " = 10");
//        }

        int min = 12;
        int max = 79;
        int key = 9;
        // print numbers between min and max before you come across the key or its twice value.
        for (int i = 12; i <= 79 ; i++) {
            System.out.println(i);
            if (i == key || i == 2*key)
                break;
        }


    }
}
