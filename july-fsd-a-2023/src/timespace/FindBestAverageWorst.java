package timespace;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindBestAverageWorst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 10) {
            System.out.println(n);
        } else if (n > 10000) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    sum = sum + j;
                }
            }
            System.out.println(sum);
        } else {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

    }
}

