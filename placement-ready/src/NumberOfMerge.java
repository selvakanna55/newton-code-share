import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfMerge {
    static int count = 0;

    public static void conquer(int[] arr, int si, int ei, int mid) {
        int[] sorted = new int[ei - si + 1];
        count++;

        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] > arr[index2]) {
                sorted[x] = arr[index2];
                x++;
                index2++;
            } else {
                sorted[x] = arr[index1];
                x++;
                index1++;
            }
        }
        while (index1 <= mid) {
            sorted[x] = arr[index1];
            x++;
            index1++;
        }
        while (index2 <= ei) {
            sorted[x] = arr[index2];
            x++;
            index2++;
        }
        for (int i = 0, j = si; i < sorted.length; i++, j++) {
            arr[j] = sorted[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquer(arr, si, ei, mid);

    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(count);

    }
}