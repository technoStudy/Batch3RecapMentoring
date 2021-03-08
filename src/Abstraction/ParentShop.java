package Abstraction;

public abstract class ParentShop {

    public void sellGroceries(){
        System.out.println("I am selling fruits");
    }

    abstract public void cookBakery();

    abstract public void takePhoto();
}
