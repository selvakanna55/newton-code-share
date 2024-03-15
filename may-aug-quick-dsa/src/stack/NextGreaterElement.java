package stack;

import java.util.*;

public class NextGreaterElement {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    private static int[] getNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nextGreaterArr = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int idx = 0; idx < n; idx++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[idx]) {
                nextGreaterArr[st.pop()] = arr[idx];
            }
            st.push(idx);
        }
        while (!st.isEmpty()) { // all remaining elements will have next greater value as -1
            nextGreaterArr[st.pop()] = -1;
        }
        return nextGreaterArr;
    }

    public static void main(String[] args) {
        // int arr[] = {19, 14, 28, 12, 11, 9, 6, 13, 22, 24, 40};
        int[] arr = {28, 12, 11, 13, 22, 40};
        int[] nextGreater = getNextGreaterElement(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextGreater));

    }
}