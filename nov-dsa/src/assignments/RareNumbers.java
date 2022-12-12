package assignments;

public class RareNumbers {
    static int Rare(int N, int K) {
        int ans = 1; //assuming all digit can be divide by k
        while (N > 0) {
            int lastDigit = N % 10;
            N = N / 10;
            if (lastDigit % K != 0) {
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
