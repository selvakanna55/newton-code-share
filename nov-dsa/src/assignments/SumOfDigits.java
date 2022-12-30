package assignments;

public class SumOfDigits {
    static long Sum(long n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + Sum(n / 10);
    }
}
