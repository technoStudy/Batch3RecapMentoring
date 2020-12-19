package Lesson6_ForLoop;

public class NestedForLoops {
    public static void main(String[] args) {
        /*
        - nested loops with examples
    - print all the prime numbers less than a given number (inclusive)
    - print all the possible letter pairs by using the letters a, b, c and d
    - print all the possible number pairs by using numbers between 1 and 5 (inclusive)
      where second number is bigger than the first number of the pair.
- Labeling loops and using break statement with labels
 */

        int num = 9;

        if(num >= 2) {
            System.out.print("2, ");
        }

        for (int i = 3; i <= num; i++) {
            int number = i;

            boolean isPrime = true;
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + ", ");
            }


        }


    }
}
