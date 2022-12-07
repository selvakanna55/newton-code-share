import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SubarrayProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" "); // "6 4" -> ["6", "4"]
        int n = Integer.parseInt(num[0]); //"6" -> 6
        int k = Integer.parseInt(num[1]);
        num = br.readLine().split(" "); // "1 5 2 3 6 4" -> ["1", "5", "2", "3", "6", "4"]
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }

        long ans = 1; //n2
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.getFirst() == i - k) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                ans = (ans * arr[dq.getFirst()]) % 1000000007;
            }
        }
        System.out.println(ans);
    }
}

