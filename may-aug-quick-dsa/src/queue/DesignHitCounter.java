package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed


class HitCounter {
    Queue<Integer> q;

    HitCounter() {
        q = new LinkedList<>();
    }

    void hit(int timestamp) {
        q.add(timestamp);
    }

    int getHits(int timestamp) {
        while (!q.isEmpty() && q.peek() <= timestamp - 300) {
            q.remove();
        }
        return q.size();
    }
}

class DesignHitCounter {
    public static void main(String[] args) {
        HitCounter counter = new HitCounter();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            int timestamp = sc.nextInt();
            if (operation == 1) {
                counter.hit(timestamp);
            } else {
                System.out.print(counter.getHits(timestamp) + " ");
            }
        }
    }
}