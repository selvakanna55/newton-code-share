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
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int diff = j - i;
                    if (ans < diff) {
                        ans = diff;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}