package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfRecentCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            q.add(num);
            while (q.peek() < (num - 3000)) {
                q.remove();
            }
            System.out.print(q.size() + " ");
        }
    }
}