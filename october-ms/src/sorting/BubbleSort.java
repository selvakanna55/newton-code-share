package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSortArray(int arr[]) {
        // T: O(n2)
        // S: O(1)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) { //n - i- 1
                if (arr[j] > arr[j + 1]) { // 10 > 9
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2};
        System.out.println(Arrays.toString(arr));
        bubbleSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
