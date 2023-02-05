package assignments;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NewtonServersContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li[] = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            li[i] = new ArrayList<>();
        }
        int m = sc.nextInt();
        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            li[a].add(b);
            li[b].add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        int ans[] = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            ans[i] = (int) (1e9);
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int adj : li[curr]) {
                if (ans[adj] == (int) (1e9)) {
                    ans[adj] = ans[curr] + 1;
                    q.offer(adj);
                }
            }
        }
        for (int i = 2; i < n + 1; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}