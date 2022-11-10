package assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountDuplicates {
    void sortingBased() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    count++;
                } else {
                    break;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int N = 100000;
        int table[] = new int[N + 1];

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            table[num] = table[num] + 1;
        }

        for (int i = 0; i <= N; i++) {
            if (table[i] > 1) {
                System.out.println(i + " " + table[i]);
            }
        }

    }
}