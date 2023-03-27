package assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 1; i <= n; i++) {
            String curr = q.remove(); //remove element from Queue
            System.out.print(curr + " ");
            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}