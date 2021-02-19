package Lesson16_Encapsulation;

public class Account {

   private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Sorry, you do not have enough balance!");
        }
    }

}

class Transactions{

    public static void main(String[] args) {
        Account aliAccount = new Account();
        aliAccount.deposit(500);
        System.out.println(aliAccount.getBalance());
        aliAccount.withdraw(700_000);
        System.out.println(aliAccount.getBalance());
        aliAccount.withdraw(100);
        System.out.println(aliAccount.getBalance());
    }

}
