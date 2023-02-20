package assignments;

//https://my.newtonschool.co/playground/code/gauvsalz5r3p/

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class HelpAlita {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        long totalOperations = 0;
        for (int i = 0; i < n; i++) {
            long xi = x[i];
            long yi = y[i];

            while (yi > xi) { //yi -> xi //
                if (yi % 2 == 0) {
                    yi = yi / 2;
                } else {
                    yi++;
                }
                totalOperations++;
            }
            totalOperations += (xi - yi);
        }

        System.out.println(totalOperations);
    }
}