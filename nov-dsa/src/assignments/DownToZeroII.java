package assignments;


import java.util.ArrayDeque;
import java.util.Scanner;


class DownToZeroII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(1000000);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(table[sc.nextInt()]);
    }

    public static int[] table = new int[1000001];

    public static void solve(int n) {
        for (int i = 1; i <= n; i++)
            table[i] = n + 1;
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.add(0);
        while (!q.isEmpty()) {
            int next = q.poll();
            if (next > 0) for (int i = Math.min(next, n / next); i > 0; i--) {
                if (table[i * next] > table[next] + 1) {
                    table[i * next] = table[next] + 1;
                    q.add(i * next);
                }
            }
            if (next < n && table[next + 1] > table[next] + 1) {
                table[next + 1] = table[next] + 1;
                q.add(next + 1);
            }
        }
    }
}
