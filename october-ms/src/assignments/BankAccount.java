package assignments;

public class BankAccount {
    int balance;
    String name;

    BankAccount(int bakbalance, String username) {
        balance = bakbalance;
        name = username;
    }

    void depositFund(int fund) {
        balance = balance + fund;
    }

    boolean withdrawFund(int fund) {
        if (balance >= fund) {
            balance = balance - fund;
            return true;
        } else {
            return false;
        }
    }
}