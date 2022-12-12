package sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    // n = (arr1.len+arr2.len)
    //TC: O(n)
    //SC: O(n)
    public static void main(String[] args) {
        int arr1[] = {10, 12, 14, 16, 18};
        int arr2[] = {11, 13, 15, 17, 19, 21, 23};
        int n1 = arr1.length;
        int n2 = arr2.length;


        int res[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
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
        // add remaining elements
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
}
