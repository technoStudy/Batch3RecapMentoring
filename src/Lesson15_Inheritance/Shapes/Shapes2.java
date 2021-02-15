package Lesson15_Inheritance.Shapes;

public class Shapes2 {
    public static void main(String[] args) {

        Parallelorgam parallelorgam = new Parallelorgam(1, 2, 34);
        Square square = new Square(5);

//        square = parallelorgam;
        parallelorgam = square;

    }
}
