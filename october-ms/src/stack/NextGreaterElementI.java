package stack;


import java.util.*;

class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums2.length;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                int val = st.pop();
                hm.put(val, nums2[i]);
            }
            st.push(nums2[i]);
        }

        // only for result
        int n2 = nums1.length;
        int res[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            if (hm.containsKey(nums1[i])) {
                res[i] = hm.get(nums1[i]);
            } else {
                res[i] = -1;
            }
        }

        return res;
    }
}