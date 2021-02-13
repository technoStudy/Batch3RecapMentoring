package Lesson15_Inheritance.Cars;

import Lesson15_Inheritance.Cars.Car;
import Lesson15_Inheritance.Cars.Ferrari;
import Lesson15_Inheritance.Cars.Honda;
import Lesson15_Inheritance.Cars.Toyota;

/*  NOTES:
- what is inheritance and why do we use it?
- If B inherits A (B ->A) then B is child class and A is parent class
   or B is called sub class and A is called super class
- Object class
- casting
- keyword instanceOf
 */
public class Inheritance_1 {
    public static void main(String[] args) {
        Toyota toyota1 = new Toyota();
        toyota1.color = "Blue";

        Honda honda1 = new Honda();
        honda1.isNew = false;

        Ferrari ferrari = new Ferrari();
        ferrari.isNew = true;

        Car car = new Car();
    }
}
