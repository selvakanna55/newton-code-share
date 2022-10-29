package batch_assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LinearProbingInHashing {
    static int hashf(int num, int hashSize) {
        return num % hashSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int hashSize = sc.nextInt();
            int nums = sc.nextInt();
            int ht[] = new int[hashSize];
            Arrays.fill(ht, -1); // -?> arr[i] = -1;

            for (int j = 0; j < nums; j++) {
                int num = sc.nextInt();
                int hash = hashf(num, hashSize);
                int i = 0;

                while (i < hashSize && ht[(hash + i) % hashSize] != -1) {
                    i++; // linear probing
                }
                if (i < hashSize) {
                    ht[(hash + i) % hashSize] = num;
                }
            }

            for (int i = 0; i < hashSize; i++) {
                System.out.print(ht[i] + " ");
            }
            System.out.println();

        }
    }
}
