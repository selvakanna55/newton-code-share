package oops.inheritance;

public class StudentSavingsAccount extends SavingsAccount {
    int maxWdlLimit = 500000;

    StudentSavingsAccount() {
        maintanaceChargeAmount = 0;
        interestRate = 7;
        minimumBalance = 0;
    }

    int getMaxWdlLimit() {
        return maxWdlLimit;
    }

}
