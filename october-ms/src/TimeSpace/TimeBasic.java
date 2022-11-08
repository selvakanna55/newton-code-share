package TimeSpace;

import java.util.Scanner;

public class TimeBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1 rupee
        // to run 1 line of code 1 rupee, how much rupee?
        int n = sc.nextInt(); // 3
        int sum = 0; // 1

//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}

//10 14
