package stack;

// https://my.newtonschool.co/playground/code/79vglxwf31u3

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class CyclicNextGreaterElement {
    private static int[] getNextGreaterCyclic(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!st.isEmpty() && arr[st.peek()] < arr[index]) {
                res[st.pop()] = arr[index];
            }
            st.push(index);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = getNextGreaterCyclic(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}