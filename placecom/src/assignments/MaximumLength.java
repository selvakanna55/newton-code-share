package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaximumLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int freq[] = new int[100001];
        int uniqueCount = 0;
        int ans = 0;
        for (int right = 0; right < n; right++) {
            freq[arr[right]]++;
            if (freq[arr[right]] == 1) {
                uniqueCount++;
            }
            while (uniqueCount > k - 1) {
                freq[arr[left]]--;
                if (freq[arr[left]] == 0) {
                    uniqueCount--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        System.out.println(ans);
    }
}
// find largest sub array that contains atmost k-1 unique numbers ->
// sliding window/two poninter -> min/max sub array