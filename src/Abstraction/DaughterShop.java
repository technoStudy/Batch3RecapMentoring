package Abstraction;

public class DaughterShop extends ParentShop{
    @Override
    public void cookBakery() {
        System.out.println("I cook cookies and cakes");
    }

    @Override
    public void takePhoto() {
        System.out.println("I take wedding photos.");
    }
}
