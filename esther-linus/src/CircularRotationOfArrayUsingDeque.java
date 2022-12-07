import java.util.Deque;

public class CircularRotationOfArrayUsingDeque {
    static void circularRotate(Deque<Integer> deq, int d, int n) {
        for (int i = 0; i < d % n; i++) {
            int lastNum = deq.getLast();
            deq.removeLast();
            deq.addFirst(lastNum);
        }
    }
}
