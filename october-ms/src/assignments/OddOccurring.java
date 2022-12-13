package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        while (i < n) {
            int count = 0;
            int num = arr[i];
            while (i < n && arr[i] == num) {
                count++;
                i++;
            }
            if (count % 2 == 1) {
                System.out.println(num);
                break;
            }
        }
    }
}