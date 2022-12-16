package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ChessBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String nums[] = br.readLine().split(" "); //"10 20 30" -> ["10","20", "30"]
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != (i + j) % 2) {
                    count++;
                }
            }
        }


        int match = (n * n) - count;
        System.out.println(Math.min(count, match));
    }
}