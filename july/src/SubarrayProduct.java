import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SubarrayProduct {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String num2[] = r.nextLine().split(" ");
        int n = Integer.parseInt(num2[0]);
        int k = Integer.parseInt(num2[1]);
        String nums[] = r.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(maxproduct(arr, n, k));
    }

    static long maxproduct(int[] arr, int n, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        // insert till k
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        long ans = arr[dq.getFirst()];
        for (int i = k; i < n; i++) {

            if (dq.getFirst() == i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            ans = (ans * arr[dq.getFirst()]) % 1000000007;
        }
        return ans % 1000000007;
    }
}