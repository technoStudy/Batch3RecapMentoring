package Lesson15_Inheritance.Shapes;

public class Shapes {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.angle);
        System.out.println(square.calculateArea());
    }
}
