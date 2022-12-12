package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddSubarray {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        long countOdd = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                ans = ans + ((countOdd * (countOdd + 1)) / 2);
                countOdd = 0;
            } else {
                countOdd++;
            }
        }
        ans = ans + ((countOdd * (countOdd + 1)) / 2);
        System.out.println(ans);
    }
}

// 1->n
// n^2