package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ElectionResultContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long BJP = sc.nextLong();
        long LJP = sc.nextLong();
        long Congress = sc.nextLong();
        long ShivSena = sc.nextLong();
        long RJD = sc.nextLong();
        long JDU = sc.nextLong();
        long SP = sc.nextLong();

        long required = n / 2;
        long nda = BJP + LJP;
        long upa = Congress + ShivSena;
        long left = RJD + JDU + SP;

        if (nda >= required) {
            System.out.println("NDA");
        } else if (upa >= required) {
            System.out.println("UPA");
        } else if (left >= required) {
            System.out.println("Left");
        } else {
            System.out.println("No government");
        }
    }
}

// 10^9 -> int
//10^18 -> long