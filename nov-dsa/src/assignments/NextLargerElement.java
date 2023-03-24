package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NextLargerElement {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek();
            } else {
                res[i] = -1;
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}