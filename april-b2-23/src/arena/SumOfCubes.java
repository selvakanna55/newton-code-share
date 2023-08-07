package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SumOfCubes {
    public static boolean hasCubeSumRepresentation(long n) {
        for (int a = 1; a * a * a <= n; a++) {
            int b = (int) Math.cbrt(n - a * a * a);
            if (b >= a && a * a * a + b * b * b == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String ans = "NO";
        for (long i = 1; i <= Math.cbrt(n); i++) {
            for (long j = 1; j <= Math.cbrt(n); j++) {
                long curr = (i * i * i) + (j * j * j);
                if (curr == n) {
                    ans = "YES";
                    break;
                }
            }
            if (ans == "YES") {
                break;
            }
        }
        System.out.println(ans);


    }
}