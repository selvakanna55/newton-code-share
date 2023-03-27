package assignments;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Notification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>(); //
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            q.add(num); // add to queue (end)
            while (!q.isEmpty() && q.peek() < num - 1000) { //1006-1000
                q.remove();
            }
            System.out.print(q.size() + " ");
        }
    }
}

// 5
// 5 155 1006 1623 1900