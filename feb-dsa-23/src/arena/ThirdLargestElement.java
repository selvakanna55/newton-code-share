package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ThirdLargestElement {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int FirstLargestElementIdx = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > arr[FirstLargestElementIdx]) {
                FirstLargestElementIdx = i;
            }
        }
        arr[FirstLargestElementIdx] = -1;
        int SecondLargestElement = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > arr[SecondLargestElement]) {
                SecondLargestElement = i;
            }
        }
        arr[SecondLargestElement] = -1;
        int ThirdLargestElement = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > arr[ThirdLargestElement]) {
                ThirdLargestElement = i;
            }
        }
        System.out.println(arr[ThirdLargestElement]);
    }
}