package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumOfTheLastKNumbersContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        long sum = 0;
        while (t-- > 0) {
            int op = sc.nextInt();
            if (op == 1) {
                int val = sc.nextInt();
                sum = sum + val;
                q.offer(val);
                if (q.size() > k) {
                    sum = sum - q.poll();
                }
            } else {
                System.out.println(sum);
            }
        }

    }
}
