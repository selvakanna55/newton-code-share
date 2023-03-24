package assignments;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NearestSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty())
                System.out.print(-1 + " ");
            else
                System.out.print(st.peek() + " ");
            st.push(arr[i]);
        }


    }
}


//  5 7 18 3 1