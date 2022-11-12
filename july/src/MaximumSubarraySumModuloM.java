
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumSubarraySumModuloM {
    static long maxSubarray(long[] arr, int n, long m) {
        long x = 0;
        long prefix = 0;
        long max = 0;
        TreeSet<Long> ss = new TreeSet<Long>();
        ss.add(0L);

        for (int i = 0; i < n; i++) {
            prefix = (prefix + arr[i]) % m;
            max = Math.max(max, prefix);
            max = Math.max(max, arr[i] % m);

            // long it = 0;
            // for(long j:ss){
            //     if(j>=prefix+1)
            //     it = j;
            // }
            Long it = ss.higher(prefix + 1);
            if (it != null) {
                // if(it!=0){
                max = Math.max(max, prefix - it + m);
            }
            ss.add(prefix);
        }
        return max;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxSubarray(arr, n, m));

    }
}