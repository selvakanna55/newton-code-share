package oops.inheritance;

public class SavingsAccount extends BankAccount {
    int maintanaceChargeAmount = 50;
    int interestRate = 3;

    SavingsAccount() {
        minimumBalance = 1000;
    }

    void creditInterest() {
        balance = balance + (balance * interestRate) / 100;
    }

    void maintananceCharge() {
        balance = balance - maintanaceChargeAmount;
    }

}
