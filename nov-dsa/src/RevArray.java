public class RevArray {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60, 70};
        int n = nums.length;


        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }


    }
}
