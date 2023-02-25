package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FirstAndLastContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            for (int i = 1; i < n; i++) {
                sum = Math.max(sum, (arr[i - 1] + arr[i]));
            }
            sum = Math.max((arr[0] + arr[n - 1]), sum);
            System.out.println(sum);
        }
    }
}