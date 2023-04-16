package maths;

public class PrimeSieve1 {
    public static void main(String[] args) {
        int n = 20;
        boolean isPrime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        //n*log*logn
        // 1 num
        //16*2 -> 32
        //Sqrt(n)<n*log*logn


        // first n numbers
        // n*sqrt(n)  > n*log*logn

    }
}
