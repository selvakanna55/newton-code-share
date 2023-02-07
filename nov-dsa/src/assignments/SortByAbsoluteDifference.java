package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class SortByAbsoluteDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            Integer arr1[] = new Integer[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = scan.nextInt();
            }

            Arrays.sort(arr1, (a, b) -> {
                return Math.abs(a - k) - Math.abs(b - k);
            });


            for (int i = 0; i < n; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    }
}