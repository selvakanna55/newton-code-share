

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SequenceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> left = new PriorityQueue<>(); // small
        PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder()); // maxi

        long leftSum = 0;
        long rightSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum = leftSum + arr[i];
            left.add(arr[i]);
        }

        long leftArray[] = new long[3 * n];
        leftArray[n - 1] = leftSum;
        for (int i = n; i < 2 * n; i++) {
            left.add(arr[i]);
            leftSum = leftSum + arr[i];
            leftSum = leftSum - left.poll();
            leftArray[i] = leftSum;
        }


        for (int i = 2 * n; i < 3 * n; i++) {
            rightSum = rightSum + arr[i];
            right.add(arr[i]);
        }
        long rightArray[] = new long[3 * n];
        rightArray[2 * n] = rightSum;
        for (int i = 2 * n - 1; i >= n; i--) {
            right.add(arr[i]);
            rightSum = rightSum + arr[i];
            rightSum = rightSum - right.poll();
            rightArray[i] = rightSum;
        }

        // System.out.println(Arrays.toString(leftArray));
        // System.out.println(Arrays.toString(rightArray));

        long ans = Long.MIN_VALUE;
        for (int i = n - 1; i < (2 * n); i++) {
            ans = Math.max(ans, leftArray[i] - rightArray[i + 1]);
        }
        System.out.println(ans);


    }
}