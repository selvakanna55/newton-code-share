package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountingZeroesToOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int row[] = new int[n];
        int col[] = new int[n];
        long rowZero = n;
        long colZero = n;
        while (q-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            r--;
            c--;
            if (row[r] == 0) {//not striked
                row[r] = 1;
                rowZero--;
            }
            if (col[c] == 0) {
                col[c] = 1;
                colZero--;
            }
            System.out.print((rowZero * colZero) + " ");
        }
    }
}