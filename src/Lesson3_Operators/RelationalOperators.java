package Lesson3_Operators;

public class RelationalOperators {
    // < , > , <= , >=
    //  instanceOf (you will see this later)
    public static void main(String[] args) {

        Car toyota = new Car();
        Vehicle train = new Vehicle();

        System.out.println(toyota instanceof Car);  //true
        System.out.println(train instanceof Vehicle);  // true
        System.out.println(toyota instanceof Vehicle);  // true
    }
}




class Car extends Vehicle{

}

class Vehicle {

}