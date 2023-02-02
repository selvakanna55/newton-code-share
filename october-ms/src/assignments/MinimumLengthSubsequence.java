package assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// abefacdaebcd

// don't change the name of this class
// you can add inner classes if needed
class MinimumLengthSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Queue<Integer> q[] = new Queue[26];
        for (int i = 0; i < 26; i++) {
            q[i] = new LinkedList<>();
        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            q[ch - 'a'].add(i);
        }
        // for(int i=0;i<26;i++){
        //     System.out.println(q[i]);
        // }
        int ans = Integer.MAX_VALUE;

        while (!q[0].isEmpty()) {
            int aIdx = q[0].remove();
            int run = aIdx;
            boolean foundZ = true;
            for (int i = 1; i < 26; i++) {
                while (!q[i].isEmpty() && q[i].peek() < run) {
                    q[i].poll();
                }
                if (q[i].isEmpty()) {
                    foundZ = false;
                    break;
                }
                run = q[i].peek();
            }
            if (!foundZ) break;
            ans = Math.min(ans, run - aIdx + 1);
        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}