package batch_assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CricketFever {
    static int findWinner(int arr[]) {
        int n = arr.length;
        if (n == 1) return arr[0];
        else if (n == 2) return Math.max(arr[0], arr[1]);
        int ans[] = new int[n / 2];

        for (int i = 0; i < n; i += 4) {
            if (arr[i] >= arr[i + 1]) {
                ans[i / 2] = arr[i];
                ans[i / 2 + 1] = arr[i + 1];
            } else {
                ans[i / 2 + 1] = arr[i];
                ans[i / 2] = arr[i + 1];
            }
            //4>=1
            if (arr[i + 2] >= arr[i + 3]) {
                ans[i / 2 + 1] += arr[i + 2];
                ans[i / 2] += arr[i + 3];
            } else {
                ans[i / 2 + 1] += arr[i + 3];
                ans[i / 2] += arr[i + 2];
            }
        }
        return findWinner(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1<<n
        n = (int) Math.pow(2, n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findWinner(arr));
    }
}