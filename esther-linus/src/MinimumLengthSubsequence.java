

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinimumLengthSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        Queue<Integer> q[] = new LinkedList[26];
        for (int i = 0; i < 26; i++) {
            q[i] = new LinkedList<>();
        }

        for (int i = 0; i < n; i++) {
            int idx = word.charAt(i) - 'a';
            q[idx].add(i);
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(q[i]);
        }
        int ans = Integer.MAX_VALUE;
        while (!q[0].isEmpty()) {
            int start = q[0].peek(); // index a // 10   > 10
            int idx = q[0].poll(); // index a // 10   > 10
            boolean found = true;
            for (int i = 1; i < 26; i++) {
                while (!q[i].isEmpty() && q[i].peek() < idx) {
                    q[i].poll();
                }
                if (q[i].isEmpty()) {
                    found = false;
                    break;
                }
                idx = q[i].peek();
            }
            if (!found) break;
            ans = Math.min(ans, idx - start + 1);
            System.out.println(ans);
        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }

    }
}
