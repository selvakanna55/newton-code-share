package sortings;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    static void megre(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int arr[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr[i] < arr[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
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

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String args[]) {
        int arr1[] = {1, 8, 14, 22, 29};
        int arr2[] = {2, 9, 18};
        megre(arr1, arr2);

    }
}