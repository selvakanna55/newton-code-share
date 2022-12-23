package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountFrequencies {
    public static void main(String[] args) {
        int freq[] = new int[10001];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq[num] = freq[num] + 1;
        }
        for (int i = 0; i < 10001; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }

    }
}