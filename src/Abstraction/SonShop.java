package Abstraction;

public abstract class SonShop extends ParentShop{

    public abstract void cookBakery();

    @Override
    public void takePhoto() {
        System.out.println("I take passport size photos.");
    }

    @Override
    public void sellGroceries(){
        System.out.println("I sell vegetables and fruits.");
    }

    public void sellSpareParts(){
        System.out.println(" I sell Toyota spare parts.");
    }

}
