package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AlexaAndBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong(); //cyan
        long c = sc.nextLong(); //red
        long d = sc.nextLong();

        long red = 0;

        long result = 0;
        if (b >= (c * d)) {
            System.out.println(-1);
        } else {
            while (a > (red * d)) {
                a = a + b;
                red = red + c;
                result++;
            }
            System.out.println(result);
        }
    }
}
