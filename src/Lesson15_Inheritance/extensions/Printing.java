package Lesson15_Inheritance.extensions;

public class Printing {

    public static void main(String[] args) {
        Parent1 child1 = new Child1();
        Parent1 child2 = new Child2();

        System.out.println(child1 instanceof Child2);  // false
        System.out.println(child1 instanceof Child1);  // true
        System.out.println(child1 instanceof Parent1);  //true

    }

}
