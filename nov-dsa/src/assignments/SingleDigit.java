package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SingleDigit {
    static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int lasDigit = num % 10;
            sum = sum + lasDigit;
            num = num / 10; // remove last lasDigit
        }
        return sum;
    }

    static int rec(int num) {
        if (num == 0) {
            return 0;
        }
        int lasDigit = num % 10;
        return lasDigit + rec(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 9) {
            n = rec(n);
        }
        System.out.println(n);

    }
}