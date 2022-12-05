package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class KillingMonsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mons[] = new int[n + 1];
        int fri[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            mons[i] = sc.nextInt();
        }
        for (int i = 1; i < n + 1; i++) {
            fri[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int val = fri[i];
            int min = Math.min(val, mons[i - 1]);
            ans = ans + min;
            val = val - min;
            mons[i - 1] = mons[i - 1] - min;


            min = Math.min(val, mons[i]);
            ans = ans + min;
            val = val - min;
            mons[i] = mons[i] - min;
        }

        System.out.println(ans);


    }
}