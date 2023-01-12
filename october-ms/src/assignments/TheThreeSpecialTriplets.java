package assignments;


import java.util.Scanner;
import java.util.TreeSet;

class TheThreeSpecialTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxRight[] = new int[n];
            maxRight[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                maxRight[i] = Math.max(maxRight[i + 1], arr[i]);
            }

            TreeSet<Integer> nums = new TreeSet<>();
            long ans = -1;
            for (int i = 0; i < n - 1; i++) {
                // System.out.println(arr[i]+" "+nums);
                if (maxRight[i + 1] > arr[i]) {
                    Integer lower = nums.lower(arr[i]); // binary serarch <=arr[i]
                    if (lower != null) {
                        long currAns = lower + (((long) arr[i]) * ((long) maxRight[i]));
                        if (currAns > ans) {
                            ans = currAns;
                        }
                    }
                }
                nums.add(arr[i]);
            }
            System.out.println(ans);
        }
        // Your code here
    }
}