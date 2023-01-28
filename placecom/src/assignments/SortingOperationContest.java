package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SortingOperationContest {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
            int swapCount = 0;

            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    swapCount++;
                    if (i >= 2 && arr[i - 2] > arr[i - 1]) {
                        swapCount++;
                    }
                }
            }
            if (swapCount <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}