package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeAPContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        int diff = c - a;
        if (diff % 2 == 0) {
            System.out.println(a + (diff / 2));
        } else {
            System.out.println(-1);
        }

    }
}
