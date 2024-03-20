package queue;

// https://my.newtonschool.co/playground/code/so09en9ewfc4

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class TotalTimeNeededToBuyTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tickets[] = new int[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(i);
        }
        int time = 0;

        while (!q.isEmpty()) {
            time++;
            int curr = q.poll();
            tickets[curr]--;
            if (tickets[curr] > 0) {
                q.offer(curr);
            }
            if (tickets[curr] == 0 && curr == k)
                break;
        }
        System.out.println(time);
    }
}
