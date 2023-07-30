package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumOfAllSubArrays {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                result += (arr[j]);
            }
        }
        System.out.print(result);
    }
}