package time_space;

import java.util.Scanner;

public class SimpleLoop {
    public static void main(String[] args) {
        System.out.println("start");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("end");
    }
}
