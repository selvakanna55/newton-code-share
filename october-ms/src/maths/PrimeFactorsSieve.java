package maths;

import java.util.Scanner;

public class PrimeFactorsSieve {
    public static void main(String[] args) {
        int n = 100;
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (arr[j] == j) {
                        arr[j] = i;
                    }
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int num = sc.nextInt();
            while (num != 1) {
                System.out.print(arr[num] + " ");
                num = num / arr[num];
            }
        }
    }
}
