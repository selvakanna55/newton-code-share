package assignments;

import java.util.*;

class CountSmallerNumbers {
    static int count[];

    void merge(int nums[], int index[], int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = index[i + left];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = index[mid + i + 1];
        }

        int i = 0, j = 0, k = left;
        int rightCount = 0;
        while (i < n1 && j < n2) {
            if (nums[arr1[i]] <= nums[arr2[j]]) { // take from left
                count[arr1[i]] = count[arr1[i]] + rightCount;
                index[k++] = arr1[i++];
            } else { // take from right
                index[k++] = arr2[j++];
                rightCount++;
            }
        }

        while (i < n1) {
            count[arr1[i]] = count[arr1[i]] + rightCount;
            index[k++] = arr1[i++];
        }
        while (j < n2) {
            index[k++] = arr2[j++];
        }
    }

    void mergeSort(int nums[], int index[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(nums, index, left, mid);
        mergeSort(nums, index, mid + 1, right);
        merge(nums, index, left, right, mid);
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int index[] = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        count = new int[n];
        mergeSort(nums, index, 0, n - 1);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(count[i]);
        }
        return li;
    }

}