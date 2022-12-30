package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TowerOfHanoi {
    static void towerOfHanoi(int n, char A, char C, char B) {
        if (n == 1) {
            System.out.println(n + ":" + A + "->" + C);
            return;
        }
        towerOfHanoi(n - 1, A, B, C);
        System.out.println(n + ":" + A + "->" + C);
        towerOfHanoi(n - 1, B, C, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}