package revision;


//{ Driver Code Starts
//Initial Template for Java

// https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1

import java.util.Stack;


public class TheCelebrityProblem {
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n) {
        // run a loop on every row
        // if row is all 0 ensure that colum is for all other rows
        // code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 1) { //if a knows b?
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int ans = -1;
        int i = st.pop();
        int rowSum = 0;
        for (int j = 0; j < n; j++) {
            rowSum += arr[i][j];
        }
        if (rowSum == 0) {
            int colSum = 0;
            for (int row = 0; row < n; row++) {
                colSum += arr[row][i];
            }
            if (colSum == n - 1) { // n-1 others know i
                ans = i;
            }
        }
        return ans;
    }
}