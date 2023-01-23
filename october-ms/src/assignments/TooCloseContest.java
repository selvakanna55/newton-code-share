package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TooCloseContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[10001];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num] = 1;
        }

        int back = k;
        int forward = k;
        int ans = -1;
        while (ans == -1) {
            if (arr[back] == 0) {//back is not present
                ans = back;
            } else if (arr[forward] == 0) {
                ans = forward;
            }
            back--;
            forward++;
        }
        System.out.println(ans);
    }
}