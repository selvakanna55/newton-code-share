package assignments;

import java.util.ArrayList;

class CountSmallerNumbers {
    static int count[];

    public static void merge(int arr[], int index[], int left, int right, int mid) {
        int n1 = mid - left + 1; // 5-4+1
        int n2 = right - mid; // 7-5
        int rightCount = 0;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = index[left + i];
        }

        for (int j = 0; j < n2; j++) {
            arr2[j] = index[mid + j + 1];
        }

        // merge two sorted array
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (arr[arr1[i]] <= arr[arr2[j]]) {
                index[k] = arr1[i];
                count[arr1[i]] += rightCount;
                // System.out.println(count.length+" "+arr1[i]);
                i++;
            } else {
                index[k] = arr2[j];
                rightCount++;
                j++;
            }
            k++;
        }
        while (i < n1) {
            index[k] = arr1[i];
            count[arr1[i]] += rightCount;
            i++;
            k++;
        }

        while (j < n2) {
            index[k] = arr2[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int arr[], int index[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, index, left, mid);
            mergeSort(arr, index, mid + 1, right);
            merge(arr, index, left, right, mid);
        }
    }

    public ArrayList<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        int index[] = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        mergeSort(nums, index, 0, n - 1);
        ArrayList<Integer> li = new ArrayList();
        for (int i = 0; i < n; i++) {
            li.add(count[i]);
        }
        // for(int i:index){
        //     System.out.println(nums[i]);
        // }
        return li;
    }
}
