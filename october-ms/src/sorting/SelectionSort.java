package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSortArray(int arr[]) {
        // T: O(N^2)
        // S: O(1)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // swap i, minIdx
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 2, 3, 1, 8};
        System.out.println(Arrays.toString(arr));
        selectionSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
