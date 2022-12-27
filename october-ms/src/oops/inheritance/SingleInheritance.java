package oops.inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        SavingsAccount sb = new SavingsAccount();
        sb.balance = 1000;
        sb.name = "Tarun";
        System.out.println(sb.balance);
        sb.deposit(100);
        System.out.println(sb.balance);
        sb.withDraw(90);
        System.out.println(sb.balance);
        sb.withDraw(20);
    }
}

