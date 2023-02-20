package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountWithBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        long powersOfTwo[] = new long[30];
        powersOfTwo[0] = 1;
        for (int i = 1; i < 30; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }

        int n = binary.length();
        long count = 0;
        for (int i = n - 1; i >= 0; i--) {
            long num = 0;
            for (int j = i; j >= 0 && (i - j) < 23; j--) { //add more conditions
                int len = i - j + 1;
                if (binary.charAt(j) == '1') {
                    num = num + powersOfTwo[len - 1];
                }
                if (num == len) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}