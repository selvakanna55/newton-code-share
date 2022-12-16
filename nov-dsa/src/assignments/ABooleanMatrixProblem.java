package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ABooleanMatrixProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
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

            for (int i = 0; i < rows; i++) {
                boolean onePresent = false;
                for (int j = 0; j < cols; j++) {
                    if (arr[i][j] == 1) {
                        onePresent = true;
                        break;
                    }
                }

                if (onePresent == true) {
                    for (int k = 0; k < cols; k++) {
                        System.out.print("1 ");
                    }
                } else {
                    for (int k = 0; k < cols; k++) {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }


        }
    }
}