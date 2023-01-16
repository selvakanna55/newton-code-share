package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LexographicalRotationContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }

        for (int i = minIdx; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < minIdx; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}