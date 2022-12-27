package oops.inheritance;

import java.util.ArrayList;

public class BusinessAccount extends BankAccount {

    BusinessAccount(int miniBal) {
        minimumBalance = miniBal;
    }

    void bulkTransfer(int amount1, int amount2) {
        int sum = amount1 + amount2;
        if ((balance - sum) >= minimumBalance) {
            withDraw(sum);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient funds for transfer");
        }
    }
}
