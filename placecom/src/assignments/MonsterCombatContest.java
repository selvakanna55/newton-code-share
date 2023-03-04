package assignments;


import java.io.*; // for handling input/output
import java.util.*;

class MonsterCombatContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int killed = 0;
        for (int killer = 1; killer < n; killer++) {
            if (arr[killer] > arr[killed]) {
                killed++;
            }
        }
        System.out.print(n - killed);
    }
}