package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowWithMaximum1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cal = input.nextInt();
        int row = input.nextInt();
        int[][] arr = new int[cal][row];
        for (int i = 0; i < cal; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int maxIndex = 0;
        int maxcount = 0;
        for (int i = 0; i < cal; i++) {
            int countones = 0;
            for (int j = 0; j < row; j++) {
                if (arr[i][j] == 1) {
                    countones++;
                }
            }
            if (countones > maxcount) {
                maxcount = countones;
                maxIndex = i;
            }
        }
        System.out.print(maxIndex);
    }
}