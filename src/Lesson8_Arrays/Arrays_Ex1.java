package Lesson8_Arrays;

public class Arrays_Ex1 {
    public static void main(String[] args) {

//        A bank has 4 customers. Each customer has a checking account and a saving account.
//    Step 1: Declare an array having the names of the customers
    String[] names = {"Ayse", "Hasan", "Seher", "Sinan"};

//    Step 2: Declare an array having the amounts in the checking accounts.
        int[] checking = {1550, 687, 3264, 1554};

//    Step 3: Declare an array having the amounts in the saving accounts.
        int saving[] = {235, 20, 314, 45};

//    Step 4: Print "[Name of the customer] has [amount] in the checking account and [amount] in the saving account."
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " has " + checking[i] + "in the checking account and " + saving[i] + " in the saving account.");
        }

//    Step 5: Print the total amount of checking accounts

        int totalChecking = 0;
        for (int i = 0; i < checking.length; i++) {
            totalChecking += checking[i];
        }
        System.out.println("Total amount in checking accounts in the bank is " + totalChecking);

//    Step 5: Print the total amount of saving accounts
        int totalSaving = 0;
        for (int i = 0; i < saving.length; i++) {
            totalSaving += saving[i];
        }
        System.out.println("Total amount in saving accounts in the bank is " + totalSaving);

    }

}
