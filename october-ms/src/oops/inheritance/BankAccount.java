package oops.inheritance;

public class BankAccount {
    int minimumBalance = 100;
    String name;
    int balance;

    void deposit(int fund) {
        balance = balance + fund;
    }

    void withDraw(int fund) {
        if ((balance - fund) >= minimumBalance) {
            balance = balance - fund;
            System.out.println("suceesfully withdrwaed " + fund);
        } else {
            System.out.println("insuffcient funds");
        }
    }
}


