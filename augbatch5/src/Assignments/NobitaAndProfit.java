package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NobitaAndProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buyPrice = sc.nextInt();
        int sellPrice = sc.nextInt();
        System.out.println(sellPrice - buyPrice);
    }
}