package Lesson17_Polymorphism;

public class OverridingExs {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.read();
    }
}


class Book{
    public void read(){
        System.out.println("I am reading a book");
    }
}

class Magazine extends Book{

    @Override
    public void read(){
        System.out.println("I am reading a magazine");
    }
}