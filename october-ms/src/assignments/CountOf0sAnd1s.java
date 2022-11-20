package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountOf0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                oneCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println(oneCount + " " + zeroCount);
    }
}