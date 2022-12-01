package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TowerOfHanoi {
    static void towerOfHanoi(int n, char src, char helper, char dest) {
        if (n == 1) {
            System.out.println(n + ":" + src + "->" + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println(n + ":" + src + "->" + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}


// 2^n -1 -> 2^n