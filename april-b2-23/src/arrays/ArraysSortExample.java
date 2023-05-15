package arrays;

import java.util.Arrays;

class ArraysSortExample {
    public static void main(String args[]) {
        int arr[] = {30, 20, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}