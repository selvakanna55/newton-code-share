package sorting;

public class MergeSortArray1 {
public static void merge(int arr[], int left, int right, int mid) {
    //extracting left and right array
    int n = mid - left + 1;
    int m = right - mid;
    int L[] = new int[n];
    int R[] = new int[m];
    for (int i = 0; i < n; i++) {
        L[i] = arr[left + i];
    }
    for (int i = 0; i < m; i++) {
        R[i] = arr[mid + 1 + i];
    }
    //merge two sorted arrays
    int i = 0;
    int j = 0;
    int k = left;
    while (i < n && j < m) {
        if (L[i] < R[j]) {
            arr[k] = L[i];
            k++;
            i++;
        } else {
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    while (i < n) {
        arr[k] = L[i];
        k++;
        i++;
    }

    while (j < m) {
        arr[k] = R[j];
        k++;
        j++;
    }


    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // sort left array
            mergeSort(arr, mid + 1, right); // sort right array
            merge(arr, left, right, mid); //O(n)
        }
    }

    public static void main(String[] args) {
//        int arr[] = {6, 5, 12, 10, 9, 1};
        int arr[] = {12, 10, 11, 8};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
