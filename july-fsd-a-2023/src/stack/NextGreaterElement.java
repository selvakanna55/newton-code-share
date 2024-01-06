package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        long nge[] = new long[n];
        // Arrays.fill(nge, -1);

        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] < arr[i]) {
                nge[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (st.size() > 0) {
            nge[st.pop()] = -1;
        }
        return nge;
    }

}
