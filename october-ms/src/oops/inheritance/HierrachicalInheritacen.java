package oops.inheritance;

import java.util.ArrayList;

public class HierrachicalInheritacen {
    public static void main(String[] args) {
        BusinessAccount ba = new BusinessAccount(10000);
        ba.balance = 100000;
        ba.deposit(1000);
        System.out.println(ba.balance);
        ba.bulkTransfer(100, 200);
        System.out.println(ba.balance);

    }
}
