
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int freq[] = new int[100001];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq[num] = freq[num] + 1;
        }
        // System.out.println(Arrays.toString(freq));

        for (int i = 0; i < 100001; i++) {
            if (freq[i] > 1) {
                System.out.println(i + " " + freq[i]);
            }
        }


    }
}