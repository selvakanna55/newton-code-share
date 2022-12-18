package maths;

public class PrimeSieve {
    public static void main(String[] args) {
        // SC: O(N)
        // TC: O(N*(log(logN))
        int n = 50;
        boolean arr[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = true;
        }
        // mark 0, 1 as not a prime
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
