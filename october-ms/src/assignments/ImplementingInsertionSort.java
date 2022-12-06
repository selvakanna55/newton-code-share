package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ImplementingInsertionSort {
    public static void insertionSortArray(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int val = arr[i];
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            insertionSortArray(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}