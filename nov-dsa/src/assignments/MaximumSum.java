package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaximumSum {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] >= 0) {
                sum += arr[j];
            }
        }
        System.out.println(sum);
    }
}