package assignments;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class KPairsContest {
    static int greaterElements(long a[], int right, long k, int left) {
        int n = a.length;
        int count = n;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] >= k) {
                count = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long count = 0;
        long arr[] = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        // int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            long y = K / arr[i];
            if (y * arr[i] < K) y++;
            int t = greaterElements(arr, N - 1, y, i + 1);
            count = count + t;
        }
        System.out.print(count);
    }
}