package assignments;


import java.util.*;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int cnt = 2 * i - 1;
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int j = 0; j < cnt; j++)
                System.out.print("*");
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.println("");
        }
    }
}
