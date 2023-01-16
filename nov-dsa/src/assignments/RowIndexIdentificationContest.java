package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowIndexIdentificationContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums[] = br.readLine().split(" "); // "4 3" -> ["4","3"]
        int rows = Integer.parseInt(nums[0]); // "4" -> 4
        int cols = Integer.parseInt(nums[1]);  // "3" -> 3

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String nums1[] = br.readLine().split(" "); // "3 4 2" -> ["3","4","2"]
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(nums1[j]); //"2" -> 2
            }
        }

        long maxiSum = 0;
        int maxiRow = 0;
        for (int i = 0; i < rows; i++) {
            long sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            if (maxiSum < sum) {
                maxiSum = sum;
                maxiRow = i;
            }
        }
        System.out.println(maxiRow + 1);
    }
}