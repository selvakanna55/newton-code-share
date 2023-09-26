package array;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ArraySimpleTwoSum {
    public static void main(String[] args) {
        int arr[] = {4, 7, 3, 9, 10, 6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 15) {
                    System.out.println("yes");
                }
            }
        }
    }
}