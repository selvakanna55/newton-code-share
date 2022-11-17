package batch_assignments;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


class SumOfMinimumAndMaximumElementsOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dec = new ArrayDeque<>();
        Deque<Integer> inc = new ArrayDeque<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            //remove extra element (i-k)
            if (!dec.isEmpty() && dec.getFirst() <= i - k)
                dec.removeFirst();
            if (!inc.isEmpty() && inc.getFirst() <= i - k)
                inc.removeFirst();

            while (!dec.isEmpty() && arr[dec.getLast()] >= arr[i])
                dec.removeLast();
            while (!inc.isEmpty() && arr[inc.getLast()] <= arr[i])
                inc.removeLast();
            dec.addLast(i);
            inc.addLast(i);
            if (i >= k - 1) {
                sum += arr[dec.getFirst()] + arr[inc.getFirst()];
            }
        }
        System.out.println(sum);
    }
}
