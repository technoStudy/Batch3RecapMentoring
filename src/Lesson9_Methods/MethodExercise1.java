package Lesson9_Methods;

public class MethodExercise1 {
    public static void main(String[] args) {
        int peri = perimeter(5, 6, 3, 8);
        System.out.println(peri);

        System.out.println(periRectangle(4, 19));
    }

    // write a method taking four int values as sides of a quadrilateral (four sided polygon)
    //and returns the perimeter of the shape
    public static int perimeter(int s1, int s2, int s3, int s4) {
        return s1 + s2 + s3 + s4;
    }

    // write a method which takes the int width and height of a rectangle and returns its int perimeter
    public static int periRectangle(int width, int height) {
        return perimeter(width, height, width, height);
    }

    // write a method which takes the int value of one side of a square and returns its int perimeter
    public static int periSquare(int side) {
        return periRectangle(side, side);
    }

}
