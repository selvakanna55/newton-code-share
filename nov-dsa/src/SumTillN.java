public class SumTillN {
    public static void main(String[] args) {
        int n = 31; // to execute one 1 unit

//        int sum = 0;
//        for (int k = 1; k <= n; k++) { //O(n)
//            sum = sum + k;
//        }
        System.out.println((n * (n + 1)) / 2);
//        System.out.println(sum);

//        for (int i = 1; i <= n; i++) { // n
//            for (int j = 1; j <= n; j++) {
//                sum = sum + i;
//            }
//        }
        // logn?
//        int i = 0;
//        while (n > 1) {
//            System.out.println(n);
//            n = n / 2;
//            i++;
//        }
        // log2 1024 -> 10
//        System.out.println(i);

        // space
        int arr[] = new int[n]; //
        int grid[][] = new int[n][n]; //n2

    }
    // O(n) -> worst case
    // omega(1) -> best
}
