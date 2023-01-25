package revision_dsa1;

import java.util.Arrays;

public class Sorting {
    static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) { //n-i-1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
//        int arr[] = {5, 9, 8, 4, 1};
        int arr[] = {8, 4, 5, 7};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
