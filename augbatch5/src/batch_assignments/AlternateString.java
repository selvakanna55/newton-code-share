package batch_assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// don't change the name of this class
// you can add inner classes if needed
class AlternateString {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();

        int mininumFlip = Integer.MAX_VALUE;

        int misMatchCount = 0;
        for (int i = 0; i < (2 * n); i++) {

            int r = i % n;

            //add mis watch count in current window
            if ((s.charAt(r) - '0') != (i % 2 == 0 ? 1 : 0)) misMatchCount++;

            //remove mismatch count which are not relvent for current window
            if (i >= n && (s.charAt(r) - '0') != (r % 2 == 0 ? 1 : 0)) misMatchCount--;


            //misMatchCount : when valid binary string start from 1
            //n - misMatchCount : when valid binary string start from 0
            if (i >= n - 1) mininumFlip = Math.min(mininumFlip, Math.min(misMatchCount, n - misMatchCount));
        }
        System.out.print(mininumFlip);


    }
}