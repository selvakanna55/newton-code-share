package oops.inheritance;


class BankAccount {
    String name;
    long accountNumber;
    double balance;
    int pin;

    void setATM(int pin) {
        this.pin = pin;
    }
}

class SavingsBankAccount extends BankAccount {
    double interestRate;

    void addIntrest() {
        balance = balance + (balance * (interestRate / 100));
    }
}

class StudentBankAccount extends SavingsBankAccount {
    void payFees() {
        System.out.println("paying fees");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        StudentBankAccount sb = new StudentBankAccount();
        sb.accountNumber = 98765456;
        sb.name = "Barun";
        sb.balance = 100;
        sb.interestRate = 7.2;
        System.out.println(sb.balance);
        sb.addIntrest();
        System.out.println(sb.balance);
        sb.payFees();
        //
        sb.balance = Double.MAX_VALUE;
        sb.interestRate = Double.MAX_VALUE;
        sb.setATM(1234);
    }
}
