package batch_assignments;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SumOfMinimumAndMaximumElementsOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dec = new ArrayDeque<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int miniSum = 0;
        for (int i = 0; i < n; i++) {
            while (!dec.isEmpty() && arr[dec.getFirst()] > arr[i]) {
                dec.removeFirst();
            }
            if (!dec.isEmpty() && dec.getFirst() <= i - k) {
                dec.removeFirst();
            }
            dec.addLast(i);
            if (i >= k - 1) {
                System.out.println(arr[dec.getFirst()]);
                miniSum += arr[dec.getFirst()];
            }
        }
    }
}
