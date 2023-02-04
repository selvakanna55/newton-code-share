package assignments;


import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MatrixSumII {
    static int targetSum(int arr[], int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum == target) {
                ans++;
            }
            if (hm.containsKey(sum - target)) {
                int count = hm.get(sum - target);
                ans = ans + count;
                //hm.put(sum-target, count+1);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int result = 0;
        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();

        for (int x1 = 0; x1 < rows; x1++) {
            int sumArray[] = new int[cols];
            for (int x2 = x1; x2 < rows; x2++) {
                for (int i = 0; i < cols; i++) {
                    sumArray[i] += matrix[x2][i];
                }
                result = result + targetSum(sumArray, target);
            }
        }

        System.out.print(result);
    }
}