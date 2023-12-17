package java_collections;


import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForLoop {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // enhaced for loop
        for (int val : arr) {
            System.out.print(val + " ");
        }


        ArrayList<Integer> li = new ArrayList<>();
        li.add(-1);
        li.add(-2);
        System.out.println(li);
        for (int num : li) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}