package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ABooleanMatrixProblem {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String nums[] = br.readLine().split(" "); //"5 4" -> ["5","4"]
            int m = Integer.parseInt(nums[0]);
            int n = Integer.parseInt(nums[1]);

            int arr[][] = new int[m][n];
            for (int j = 0; j < m; j++) {
                nums = br.readLine().split(" ");
                for (int k = 0; k < n; k++) {
                    arr[j][k] = Integer.parseInt(nums[k]);
                }
            }

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[j][k] == 1) {
                        for (int x = 0; x < n; x++) {
                            arr[j][x] = 1;
                        }
                        break;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}