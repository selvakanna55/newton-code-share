package sorting;

// https://learn.newtonschool.co/visuals/bubble_sort/0

import java.util.*;

class BubbleSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int arr[]) {
        // TC: O(n^2), SC: O(1)
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }

        }
    }

    public static void main(String args[]) {
        int arr[] = {8, 7, 9, 3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}