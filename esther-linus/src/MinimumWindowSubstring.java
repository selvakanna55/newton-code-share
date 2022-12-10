

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int freqT[] = new int[128];
        for (int i = 0; i < t.length(); i++) {
            int ch = (int) t.charAt(i);
            freqT[ch]++;
        }

        int len = Integer.MAX_VALUE;
        int l = 0;
        int count = 0;
        int freqW[] = new int[128];
        for (int r = 0; r < s.length(); r++) {
            int ch = (int) s.charAt(r);
            freqW[ch]++;
            if (freqW[ch] == freqT[ch]) {
                count = count + freqT[ch];
            }

            while (l <= r && count == t.length()) {
                int Wlen = r - l + 1;
                if (len > Wlen) {
                    len = Wlen;
                }
                ch = (int) s.charAt(l);
                freqW[ch]--;
                l++;
                if (freqW[ch] < freqT[ch]) {
                    count = count - freqT[ch];
                }
            }
        }

        if (len == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println(len);
        }
    }
}