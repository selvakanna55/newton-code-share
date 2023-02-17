package practice;

import java.util.Scanner;

public class IsDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int n = number.length();
        long digitSum = 0;
        for (int i = 0; i < n; i++) {
            int digit = number.charAt(i) - '0';
            digitSum = digitSum + digit;
        }
        if (digitSum % 3 == 0 && number.charAt(n - 1) == '0') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
