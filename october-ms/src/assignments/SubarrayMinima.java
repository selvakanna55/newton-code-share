package assignments;


import java.util.Scanner;
import java.util.Stack;

// what all sub arrays, my arr[i] = 3 wil be min?
// don't change the name of this class
// you can add inner classes if needed
class SubarrayMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int nextSmaller[] = new int[n];
        int prevSmaller[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            nextSmaller[i] = n - i - 1;
            prevSmaller[i] = i;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                nextSmaller[st.peek()] = i - st.pop() - 1;
            }
            st.push(i);
        }
        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                prevSmaller[st.peek()] = st.pop() - i - 1;
            }
            st.push(i);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += ((long) nextSmaller[i] + 1) * ((long) prevSmaller[i] + 1) * (arr[i] * 1L);
        }
        System.out.println(ans);
    }
}