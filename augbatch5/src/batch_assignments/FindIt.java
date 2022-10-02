package batch_assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FindIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = -1;
        long sqrt = (long) Math.sqrt(n); //O(sqrt(n)) binary long
        for (long i = 1; i <= sqrt; i++) {
            long curr = (i * i) + (3 * i);
            if (curr == n) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}