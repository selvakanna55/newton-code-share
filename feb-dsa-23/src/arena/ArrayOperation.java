package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int max = A[0], min = A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0) {
                A[i] = A[i] - min;
            } else {
                A[i] = A[i] + max;
            }
            if (max < A[i])
                max = A[i];
            if (min > A[i])
                min = A[i];
        }
        System.out.println(max + " " + min);


    }
}