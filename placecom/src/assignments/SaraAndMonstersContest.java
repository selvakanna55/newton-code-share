package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SaraAndMonstersContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int ans = 0;
        int i = 0;
        while (true) {
            if (arr[i] - count <= 0) {
                ans = i + 1;
                break;
            }
            count++;
            i++;
            i = i % n;
        }
        System.out.println(ans);
    }
}