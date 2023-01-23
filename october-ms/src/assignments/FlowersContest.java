package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FlowersContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // making arr[i] - >odd
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] - 1;
            }
            sum = sum + arr[i]; // sum of an arr
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        // n is even
        if (n % 2 == 0) {
            System.out.println(sum - mini);
        } else {
            System.out.println(sum);
        }
    }
}