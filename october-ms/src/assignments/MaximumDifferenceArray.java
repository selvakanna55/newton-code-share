package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaximumDifferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;

        int maxRight[] = new int[n];
        maxRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(arr[i], maxRight[i + 1]);
        }

        int minLeft[] = new int[n];
        minLeft[0] = arr[0];
        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(arr[i], minLeft[i - 1]);
        }


        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (minLeft[i] < maxRight[j]) {
                if (ans < j - i) {
                    ans = j - i;
                }
                j++;
            } else {
                i++;
            }
        }

        System.out.println(ans);
    }
}

// maximum on right
// minimum on left