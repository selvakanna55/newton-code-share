package sorting;


import java.util.*;
import java.io.*;

public class QuickSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getPivotIndex(int arr[], int left, int right) {
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < arr[right]) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    public static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotIndex = getPivotIndex(arr, left, right);
            System.out.println(Arrays.toString(arr));
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static void main(String[] args) {
        // int arr[] = {10, 15, 1, 2, 6, 12, 5, 7};
        // int arr[] = {10, 15, 6, 2, 12, 7};
        // int arr[] = {10,50,25,3,20};
        // int arr[] = {8,5,9,4,6,7};
        int arr[] = {-4, 1, 25, 50, 8, 10, 23};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}