package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class LiarLiarContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = -1;
        int claimCount[] = new int[n + 1];

        for (int j = 0; j < n; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = a; i <= b; i++) {
                claimCount[i]++;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (claimCount[i] == i) {
                ans = i;
            }
        }
        // System.out.println(Arrays.toString(claimCount));
        System.out.println(ans);
    }
}