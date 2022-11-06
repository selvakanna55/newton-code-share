import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(1);
            return;
        }
        int res = 10;
        int num = 9;
        for (int i = 2; i <= n; i++) {
            num = num * (9 - i + 2);
            res = res + num;
        }
        System.out.println(res);
    }
}