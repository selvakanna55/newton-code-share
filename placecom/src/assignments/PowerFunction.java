package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class PowerFunction {
    static double pow(double a, int b) {
        if (b == 0) return 1;
        else if (b == 1) return a;
        double val = pow(a, b / 2);
        if (b % 2 == 0) {
            return val * val;
        } else {
            return a * val * val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double a = sc.nextDouble();
            int b = sc.nextInt();
            if (b < 0) {
                a = 1 / a;
                b = b * -1;
            }
            System.out.printf("%.2f\n", pow(a, b));
        }
    }
}
