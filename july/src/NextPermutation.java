
class NextPermutation {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int idx1 = -1, idx2 = -1, n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 != -1) {
            // find a number, greather than arr[idx1]
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            swap(nums, idx1, idx2);
        }


        //reverse();

    }
}


//[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]