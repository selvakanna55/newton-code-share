package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowIndexIdentificationContest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); //"3 4"
        String nums[] = line.split(" "); //["3","4"]
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int row = 1;
        long max = 0;
        long arr[][] = new long[n][m];

        for (int i = 0; i < n; i++) {
            long sum = 0;
            nums = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
                sum += arr[i][j];
            }
            if (sum > max) {
                row = i + 1;
                max = sum;
            }
        }
        System.out.println(row);

    }
}