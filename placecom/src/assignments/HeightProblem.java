package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HeightProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n];
        // for(int i=0;i<n;i++){
        //     res[i] = -1;
        // }
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            res[st.pop()] = -1;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
