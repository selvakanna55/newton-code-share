import java.util.ArrayList;
import java.util.List;

class Permutations {
    List<List<Integer>> res;

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void findAllPermutations(int[] nums, int start) {
        int n = nums.length;
        if (start == n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(nums[i]);
            }
            res.add(list);
        }
        for (int i = start; i < n; i++) {
            swap(nums, start, i);
            findAllPermutations(nums, start + 1);
            swap(nums, i, start); //undo swap
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<List<Integer>>();
        findAllPermutations(nums, 0);
        return res;
    }
}