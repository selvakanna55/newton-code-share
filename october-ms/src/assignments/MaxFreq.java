package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int table[] = new int[100 + 1];

        for (int i = 0; i < n; i++) {
            int num = arr[i]; // 3
            table[num] = table[num] + 1;
        }

        int maxFreqNum = -1;
        int maxFreq = -1;

        for (int i = 0; i < 100 + 1; i++) {
            if (table[i] >= maxFreq) {
                maxFreq = table[i];
                maxFreqNum = i;
            }
        }

        System.out.println(maxFreqNum);


    }
}