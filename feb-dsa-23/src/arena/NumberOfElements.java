package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int j = 0; j < len; j++) {
            arr[j] = sc.nextInt();
        }
        Arrays.sort(arr);
        int task = sc.nextInt();
        for (int j = 0; j < task; j++) {
            int h = sc.nextInt();
            int res = searchInt(arr, h);
            System.out.println(res);
        }
    }

    public static int searchInt(int arr[], int target) {
        int len = arr.length;
        int count = len;
        int ans = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                count = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return len - count;
    }
}