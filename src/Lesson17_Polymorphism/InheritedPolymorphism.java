package Lesson17_Polymorphism;

public class InheritedPolymorphism {
    public static void main(String[] args) {
        Child child = new Child(5);
        child.print(56);
        child.print("Hello");

        Parent parent = new Parent("Ali");
        parent.print("56");
    }
}

class Parent {
    public void print(String str) {
        System.out.println(str);
    }

    public Parent(int age){

    }

    public Parent(String name){

    }
}

class Child extends Parent {
    public Child(int age) {
        super(age);
    }

    public Child(String name) {
        super(name);
    }

    public int print(int a) {
        System.out.println(a);
        return 2 * a;
    }
}
