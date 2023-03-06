package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountersAndLinesGroupContestApril21 {
    static long allocateQ(long ppl, long counter) {
        long currAssign = counter;
        if (currAssign > ppl) {
            currAssign = ppl;
        }
        counter -= currAssign; // atleast one per counter
        return counter + currAssign * (2 * ppl - currAssign + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (m >= n) {
            System.out.println(1);
        } else {
            long start = 0, end = n;
            long ans = -1;
            while (start <= end) {
                long mid = (start + end) / 2;
                long i = mid;
                long ppl = (allocateQ(i, k) + allocateQ(i, m - k + 1) - i);
                if (ppl == n) {
                    ans = mid;
                    break;
                } else if (ppl < n) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (ans == -1) System.out.println(end);
            else System.out.println(ans);
        }
    }
}