package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class KillingMonsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int monesters[] = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            monesters[i] = sc.nextInt();
        }

        int friends[] = new int[n];
        for (int i = 0; i < n; i++) {
            friends[i] = sc.nextInt();
        }

        n++;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            // i th index
            // int diff = Math.abs(monesters[i]-friends[i]);
            //i+1 index?

            // i th index
            int mini = Math.min(monesters[i], friends[i]);
            ans = ans + mini;
            friends[i] = friends[i] - mini;
            if (i + 1 < n && friends[i] > 0) {
                mini = Math.min(monesters[i + 1], friends[i]);
                ans = ans + mini;
            }
        }
        System.out.println(ans);
    }
}