package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MonsterHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        long ans = 0;
        while (arr[k] > 0) {
            if (arr[i % n] > 0) {
                arr[i % n]--;
                ans++;
            }
            i++;
        }
        System.out.println(ans);
    }
}