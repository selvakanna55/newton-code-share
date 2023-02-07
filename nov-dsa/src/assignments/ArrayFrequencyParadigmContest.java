package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class ArrayFrequencyParadigmContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int j = 0; j < n; j++) {
            while (!st.isEmpty() && hm.get(arr[st.peek()]) <= hm.get(arr[j])) {
                ans[st.pop()] = j + 1;
            }
            st.push(j);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}


