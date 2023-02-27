package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MedianOfTwoSortedArrays {
    static double getMedian(int nums1[], int nums2[], int n1, int n2) {
        if (n2 < n1) return getMedian(nums2, nums1, n2, n1);
        int low = 0, high = n1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cut1 = mid;
            int cut2 = ((n1 + n2 + 1) / 2) - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.printf("%.2f", getMedian(a, b, n, m));
    }
}