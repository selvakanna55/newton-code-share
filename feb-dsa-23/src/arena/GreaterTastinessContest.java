package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
public class GreaterTastinessContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println();
        int count = countGreater(arr, n, k);
        System.out.print(count);


    }


    // count number > k in sorted array
    public static int countGreater(int arr[], int n, int k) {

        int left = 0;
        int right = n - 1;
        int mid1;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > k) {
                ans = n - mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // if(mid1 == -1){
        //     return 0;
        // }
        return ans;


    }
}