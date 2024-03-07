package merge_sort;
// https://my.newtonschool.co/playground/code/88ksjxni8cu7

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed

class InversionOfArray {
    static long count = 0;

    static void merge(int arr[], int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                count += (n1 - i);
                // when an element is picked from right side of the array,
                // count all remaning elements in the left side
                // as they are mistakenly placed
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }

    static void mergeSort(int arr[], int left, int right) {
        if (left == right) { // >= is needed?
            return; // that array is already sorted
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid); // get the left sorted array
        mergeSort(arr, mid + 1, right); // get right sorted array
        merge(arr, left, right, mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(count);
    }
}