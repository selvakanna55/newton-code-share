package bit_manupulation;

public class BitBasic1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 4;
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);

        System.out.println(42 >> 1); //42/2 -> 21
        System.out.println(42 >> 2); //42/4 -> 10
        System.out.println(42 >> 3);  //42/8 -> 5
        System.out.println(42 >> 4);  // 42/16 -> 2

        System.out.println(6 << 1); // 6*2^1 12
        System.out.println(6 << 2); //  6* 2^2 24
        System.out.println(6 << 3);  // 6*2^3 48
        System.out.println(6 << 4); // 6*2^4 96

        System.out.println(10 | 3);
        System.out.println(10 & 3);
        System.out.println(10 ^ 3);
    }
}

























