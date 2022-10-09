import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SquidGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Character> q = new ArrayDeque<>();
        String str = sc.next();
        for (int i = 0; i < n; i++) {
            q.addLast(str.charAt(i)); //offer -> insert
        }


        while (q.size() > 1) {
            char ch1 = q.removeFirst(); // poll -> remove
            int count = 0;
            while (!q.isEmpty() && q.peek() == ch1) {
                count++;
                q.removeFirst();
            }
            if (!q.isEmpty()) {
                q.removeFirst(); // b
                while (count > 0) {
                    q.addFirst(ch1);
                    count--;
                }
                q.addLast(ch1);
            } else {
                q.addFirst(ch1);
                break;
            }
        }
        System.out.println(q.poll());
    }
}
