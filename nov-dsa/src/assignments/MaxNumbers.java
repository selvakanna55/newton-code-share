package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Your code here
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String nums[] = br.readLine().split(" ");
            int A[] = new int[N];
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++) {
                A[j] = Integer.parseInt(nums[j]);
                if (A[j] > max) {
                    max = A[j];
                }
            }
            // Arrays.sort(A);
            // System.out.println(A[n-1]+" "+A[n-2]+" "+A[n-3]);
            int maxValue1 = Integer.MIN_VALUE;
            int maxValue2 = Integer.MIN_VALUE;
            int maxValue3 = Integer.MIN_VALUE;
            // int N =S.nextInt();
            // int A[] = new int [N];
            // for(int j=0; j<N; j++){
            //     A[j]=S.nextInt();
            // }
            int maxIdx = 0;
            for (int k = 0; k < N; k++) {
                if (A[k] >= maxValue1) {
                    maxValue1 = A[k];
                    maxIdx = k;
                }
            }
            A[maxIdx] = -1;
            maxIdx = 0;
            for (int k = 0; k < N; k++) {
                if (A[k] >= maxValue2) {
                    maxValue2 = A[k];
                    maxIdx = k;
                }
            }

            A[maxIdx] = -1;
            for (int k = 0; k < N; k++) {
                if (A[k] >= maxValue3) {
                    maxValue3 = A[k];
                }
            }
            System.out.println(maxValue1 + " " + maxValue2 + " " + maxValue3);
        }
    }
}