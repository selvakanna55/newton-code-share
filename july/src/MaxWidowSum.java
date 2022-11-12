

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class MaxWidowSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String srr[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(srr[0]);
        int k = Integer.parseInt(srr[1]);
        String ksrr[] = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ksrr[i]);
        }

        long sum = 0, ans = 0;
        for (int i = 0; i <= n - k; i++) {
            int maxval = 0;
            for (int j = i; j < i + k; j++) {
                if (j >= n) break;
                maxval = Math.max(maxval, arr[j]);
            }
            ans += maxval;
        }
        System.out.println(ans);
    }
}