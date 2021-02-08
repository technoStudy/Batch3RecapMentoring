package Constructors;

public class Constructors1 {
    public static void main(String[] args) {
//        Book book1 = new Book("Sefiller");
//        book1.pageNumber = 205;
//        System.out.println(book1.title);

        Client client1 = new Client();
        Client client2 = new Client("Mahmut");
        Client client3 = new Client(22, "Hasan");
        System.out.println(client3.isEligibleForACreditCard);

        Client client4 = new Client(22);
        System.out.println(client4.isEligibleForACreditCard);
    }
}

class Book{

    int pageNumber;
    String title;

    public Book(String title){
       this.title = title;
    }

}

class Client{
    String name;
    boolean isEligibleForACreditCard = false;
    int age;

    public Client(int age){
        this.age = age;
        if(age >= 18){
            isEligibleForACreditCard = true;
        }
    }

    public Client(){}

    public Client(String name){
        this.name = name;
    }

    public Client(int age, String name){
        this(age);
        this.name = name;
    }
}

class CreditCard{
    int cardNumber;
    private CreditCard(){}

    static CreditCard myCard = new CreditCard();
}