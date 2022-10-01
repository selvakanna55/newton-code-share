package batch_assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GCDFrequency {
    static int gcd(int a, int b) { // log(a+b)
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        int freq[] = new int[100001]; // O(n)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + gcd(arr[i], freq[arr[i]]);
        }
        System.out.println(sum);
        //TC: n*logn
        //SC: O(n)
    }
}
