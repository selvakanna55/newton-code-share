package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MakeMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b % a == 0) {
                System.out.println("YES");
            } else if (b - a >= a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}