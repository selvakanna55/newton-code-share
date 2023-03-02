import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ABooleanMatrixProblem {
    public static void main(String[] args) throws IOException {
        // Your code here
        // Scanner br = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int T = br.nextInt();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String nums[] = br.readLine().split(" "); //"5 4" -> ["5","4"]
            int m = Integer.parseInt(nums[0]);
            int n = Integer.parseInt(nums[1]);
            int[][] Mat = new int[m][n];

            for (int i = 0; i < m; i++) {
                nums = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    Mat[i][j] = Integer.parseInt(nums[j]);
                }
            }

            for (int i = 0; i < m; i++) {
                boolean val = false;
                for (int j = 0; j < n; j++) {
                    if (Mat[i][j] == 1) {
                        val = true;
                        break;
                    }
                }

                if (val) {
                    // for(int j=0;j<n;j++)
                    // {
                    //     Mat[i][j] = 1;
                    // }
                    Arrays.fill(Mat[i], 1);
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(Mat[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}