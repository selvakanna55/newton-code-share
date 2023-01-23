package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HomeAdvantageContest {
    public static int upper_bound(int arr[], int target) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int ans = n;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        int a[] = new int[n];
        int sCopy[] = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            sCopy[i] = s[i];
        }

        for (int j = 0; j < n; j++) {
            a[j] = sc.nextInt();
        }

        Arrays.sort(sCopy);

        for (int i = 0; i < n; i++) {
            int count = upper_bound(sCopy, a[i] + s[i]);
            System.out.print(count - 1 + " ");
        }
    }
}
