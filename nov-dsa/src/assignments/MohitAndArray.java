package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MohitAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int sumOfN = (n * (n + 1) / 2);

        int sumArray = 0;
        for (int i = 0; i < n - 1; i++) {
            sumArray = sumArray + arr[i];
        }
        System.out.println(sumOfN - sumArray);


    }
}