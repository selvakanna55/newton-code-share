package arena;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class KinematicMatrixContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String nums[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(nums[0]); // "3" -> 3
        int m = Integer.parseInt(nums[1]);

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            nums = sc.nextLine().split(" "); //reading by wot
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }

        if (Symmetric(arr, n, m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean Symmetric(int arr[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

}