package merge_sort;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    static void mergeTwoSorted(int arr1[], int arr2[]) {
        int n1 = arr1.length, n2 = arr2.length;
        int res[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int arr1[] = {3, 4, 7, 11, 19};
        int arr2[] = {1, 5, 9, 10, 23, 67};
        mergeTwoSorted(arr1, arr2);
    }
}