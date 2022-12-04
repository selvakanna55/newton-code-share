package assignments;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        long ans = -1;

        long left = 1;
        long right = (long) Math.sqrt(k);
        while (left <= right) {
            long mid = (left + right) / 2; // mid is x
            long curr = (mid * mid) + (3 * mid);
            // System.out.println(left+" "+right+" "+curr);
            if (curr == k) {
                ans = mid;
                break;
            }
            if (curr > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}