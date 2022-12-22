package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RGBContest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        long count = 0;


        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j = j + i) {
                count = count + (N - j);
                System.out.println(N - j);
            }
        }
        System.out.print(count);
    }
}