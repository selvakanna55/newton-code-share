package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long sum = 0;
        // n
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // n
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= maxi) { // 2>=10
                System.out.print(0 + " ");
                if (maxi < arr[i]) {
                    maxi = arr[i];
                }
            } else {
                int diff = maxi - arr[i]; // 10-2 = 8;
                System.out.print(diff + " ");
                sum = sum + diff;
            }
        }
        System.out.println();
        System.out.println(sum);

    }
}