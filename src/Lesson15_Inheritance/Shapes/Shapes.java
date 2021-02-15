package Lesson15_Inheritance.Shapes;

public class Shapes {
    public static void main(String[] args) {

        Parallelorgam parallelorgam;
        Square square = new Square(5);

        parallelorgam = square;

        System.out.println(parallelorgam.angle);
        System.out.println(parallelorgam.side1);
        System.out.println(parallelorgam.side2);


    }
}
