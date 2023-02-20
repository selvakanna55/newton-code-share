package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ans = ans ^ num;
            System.out.println(ans);
        }
        System.out.println(ans);

    }
}