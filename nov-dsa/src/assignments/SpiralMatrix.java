package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SpiralMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums[] = br.readLine().split(" "); //"4 3" -> ["4", "3"]
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);
        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            nums = br.readLine().split(" "); //"10 20 30" -> ["10","20", "30"]
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }


        int i = 0; //row
        int j = 0; // col

        while (i < rows && j < cols) {
            // 1 2 3 4
            for (int k = j; k < cols; k++) {
                System.out.print(arr[i][k] + " ");
            }
            i++;

            for (int k = i; k < rows; k++) {
                System.out.print(arr[k][cols - 1] + " ");
            }
            cols--;
            if (i < rows && j < cols) {
                for (int k = cols - 1; k >= j; k--) {
                    System.out.print(arr[rows - 1][k] + " ");
                }
                rows--;
            }
            if (i < rows && j < cols) {
                for (int k = rows - 1; k >= i; k--) {
                    System.out.print(arr[k][j] + " ");
                }
                j++;
            }


        }

    }
}