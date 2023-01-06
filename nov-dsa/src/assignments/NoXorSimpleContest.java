package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NoXorSimpleContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // ^
        for (int i = 1; i <= n; i++) {
            sum = sum + ((n - i) ^ (arr[i - 1]));
        }
        System.out.println(sum);
    }
}