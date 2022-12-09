package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeABEqual {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = S.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = S.nextInt();
        }

        int aOnes = 0;
        int bOnes = 0;

        int notMatching = 0;
        for (int j = 0; j < n; j++) {
            if (A[j] != B[j]) {
                notMatching++;
            }
            if (A[j] == 1) {
                aOnes++;
            }
            if (B[j] == 1) {
                bOnes++;
            }
        }
        int addNewNumber = Math.abs(aOnes - bOnes) + 1;
        int reArragement = notMatching;

        if (addNewNumber < reArragement) {
            System.out.print(addNewNumber);
        } else {
            System.out.print(reArragement);
        }

    }
}