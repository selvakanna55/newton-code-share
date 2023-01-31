package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumOfMinimumAndMaximumElementsOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> small = new LinkedList<>();
        long smallSum = 0;
        for (int i = 0; i < n; i++) {
            if (!small.isEmpty() && small.getFirst() <= (i - k)) {
                small.removeFirst();
            }
            while (!small.isEmpty() && arr[small.getLast()] >= arr[i]) {
                small.removeLast();
            }
            small.addLast(i);
            if (i >= k - 1) {
                smallSum += arr[small.getFirst()];
            }
        }

        Deque<Integer> big = new LinkedList<>();
        long bigSum = 0;
        for (int i = 0; i < n; i++) {
            if (!big.isEmpty() && big.getFirst() <= (i - k)) {
                big.removeFirst();
            }
            while (!big.isEmpty() && arr[big.getLast()] <= arr[i]) { // chnage >= to <= for maximum
                big.removeLast();
            }
            big.addLast(i);
            if (i >= k - 1) {
                bigSum += arr[big.getFirst()];
            }
        }
        System.out.println(smallSum + bigSum);
    }
}