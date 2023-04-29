package oops.encapsulation.accessmodifer;


class BankAccount {
    private int balance;
    private String name;
    protected double interestRate;
    public int accountNo; //default

    public String getName() { // gives the value
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() { // gives the value
        return balance;
    }

    public BankAccount(int balance, String name, double interestRate) {
        this.balance = balance;
        this.name = name;
        this.interestRate = interestRate;
    }

    void printAll() {
        System.out.println(balance + " " + name + " " + interestRate);
    }


}

public class SameClass {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100, "Varun", 7.1);
        b1.printAll();
//        System.out.println(b1.balance); //public
        System.out.println(b1.getName()); // b1.name not allowed
        b1.setName("Akash");
        System.out.println(b1.getName()); // b1.name not allowed
        System.out.println(b1.interestRate); //protected
        System.out.println(b1.accountNo); //protected

    }

}
