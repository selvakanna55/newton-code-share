package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class IndexOfTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
