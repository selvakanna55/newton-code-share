package assignments;


import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SubarrayWithGivenSum {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long sum = 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                System.out.println("1 " + (i + 1));
                flag = true;
                break;
            } else if (hm.containsKey(sum - k)) {
                int start = hm.get(sum - k) + 1;
                int end = i;
                System.out.println((start + 1) + " " + (end + 1));
                flag = true;
                break;
            }
            hm.put(sum, i);
        }
        if (!flag)
            System.out.println(-1);
    }
}
