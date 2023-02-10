package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class HipHipArray {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long evenSum = 0;
        long oddProduct = 1;
        int t = arr.length;
        int temp = 0;

        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }


        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                evenSum += arr[i];
            }
            if (i % 2 == 0) {
                oddProduct *= arr[i];
            }
        }

        System.out.print(evenSum + " " + oddProduct);
    }
}