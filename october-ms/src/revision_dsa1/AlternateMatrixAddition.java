package revision_dsa1;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AlternateMatrixAddition {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// "3" -> 3
        int arr[][] = new int[n][n];
        for (int row = 0; row < n; row++) {
            String nums[] = br.readLine().split(" "); // "1 2 3" -> ["1","2","3"]
            for (int col = 0; col < n; col++) {
                arr[row][col] = Integer.parseInt(nums[col]);
            }
        }
        long even = 0, odd = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if ((row + col) % 2 == 0) {
                    even = even + arr[row][col];
                } else {
                    odd = odd + arr[row][col];
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}