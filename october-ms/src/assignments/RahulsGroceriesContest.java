package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class RahulsGroceriesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            int[] fresh = new int[n];
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                fresh[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (fresh[i] >= x) {
                    sum += cost[i];
                }
            }
            System.out.println(sum);
        }
    }
}
