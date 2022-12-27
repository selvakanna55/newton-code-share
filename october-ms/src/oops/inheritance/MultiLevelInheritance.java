package oops.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        StudentSavingsAccount ssb = new StudentSavingsAccount();
        ssb.deposit(100);
        System.out.println(ssb.balance);
        ssb.creditInterest();
        System.out.println(ssb.balance);
        ssb.withDraw(70);
        System.out.println(ssb.balance);
    }
}
