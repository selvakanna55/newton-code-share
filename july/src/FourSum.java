import java.util.*;

class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (arr[i] * 1L) + (arr[j] * 1L) + (arr[left] * 1L) + (arr[right] * 1L);
                    if (sum == target) {
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[left]);
                        ans.add(arr[right]);
                        res.add(ans);
                        while (left < n - 1 && arr[left] == arr[left + 1]) left++;
                        while (right > 0 && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return res;
    }
}