package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxFreq {
    public static void main(String[] args) {
        int freq[] = new int[101];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq[num] = freq[num] + 1;
        }
        int num = -1;
        int maxFreq = -1;
        for (int i = 0; i < 101; i++) {
            if (freq[i] >= maxFreq) {
                maxFreq = freq[i];
                num = i;
            }
        }
        System.out.println(num);
    }
}
