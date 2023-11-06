package sorting;


import java.util.Arrays;

// don't change the name of this class
// you can add inner classes if needed
class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int result[] = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }


        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;

    }

    public static void main(String[] args) {
        int arr1[] = {1, 5};
        int arr2[] = {4, 6, 7, 9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int result[] = mergeTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}