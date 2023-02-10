package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SumUpContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        long ans = 0;
        for (int i = start; i <= end; i++) {
            int num = i;
            while (num % 2 == 0) {
                ans += num;
                num = num / 2;
            }
        }
        System.out.println(ans);
    }
}
