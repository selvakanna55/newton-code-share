package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowWithMaximum1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max_count = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            // System.out.println(count+" "+max_count);
            if (count > max_count) {
                max_count = count;
                idx = i;
            }
        }
        System.out.print(idx);
    }
}