package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountingZeroesToOnesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //3
        int rowArray[] = new int[n];
        int colArray[] = new int[n];
        int q = sc.nextInt();
        long row = n;
        long col = n;
        for (int query = 0; query < q; query++) {  // while(q-->0)
            int r = sc.nextInt();
            int c = sc.nextInt();
            r--;
            c--;
            if (rowArray[r] == 0) {
                rowArray[r] = 1;
                row--;
            }

            if (colArray[c] == 0) {
                colArray[c] = 1;
                col--;
            }
            System.out.print((row * col) + " ");
        }
    }
}