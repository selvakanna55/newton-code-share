package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long ans = -1;
        long left = 0, right = (int) Math.sqrt(k);
        while (left <= right) {
            long mid = (left + right) / 2;
            long x = mid;
            long curr = (x * x) + (3 * x);
            if (curr == k) {
                ans = x;
                break;
            } else if (curr > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // for(long x=0;x<=Math.sqrt(k);x++){
        //     long curr = (x*x) + (3*x );
        //     if( curr == k ){
        //         ans = x;
        //         break;
        //     }
        // }
        System.out.println(ans);
    }
}