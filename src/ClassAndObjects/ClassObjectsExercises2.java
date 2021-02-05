package ClassAndObjects;

public class ClassObjectsExercises2 {

    public static void main(String[] args) {

//        System.out.println(Cat.catCounter);

        Cat cat1 = new Cat();
        System.out.println("cat1 counter: " + cat1.catCounter);  // prints
        System.out.println("cat1 age: " + cat1.age);   // prints


        Cat cat2 = new Cat();
        System.out.println("cat2 counter: " + cat2.catCounter);   // prints
        System.out.println("cat2 age: " + cat2.age);  // prints


        Cat cat3 = new Cat();
        System.out.println("cat3 counter: " + cat3.catCounter);   // prints
        System.out.println("cat3 age: " + cat3.age);  // prints


        cat1.catCounter = 10;
        cat1.age = 10;

        System.out.println(cat2.catCounter);
        System.out.println(cat2.age);


        cat1.name = "Goldy";
        cat1.isHungry = false;
//        cat1.feedMe();

    }
}

class Cat{

    static int catCounter=0;  // Class variable

    {
        catCounter++;
    }
        // instance / object variables
    int age = 5;
    String name;
    boolean isHungry = false;
    String gender = "male";

    public void feedMe(){
        String catFood = "Wiskas";  // local variable (must be initialized)
        if(isHungry){
            int num  = 0;
            System.out.println("I need some " + catFood);
        } else {
            System.out.println("I am full.");
        }
    }

}
