package bit_manipulation;

public class BitManipulation {
    public static void main(String[] args) {
//        System.out.println(3 | 4);
//        System.out.println(3 & 4);
//        System.out.println(3 ^ 4);
//        System.out.println(1 << 3); // left shift *2
//        System.out.println(16 >> 2); // right shift /2
//        int num = 11;
//        if ((num & 1) == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
        int a = 10, b = 20;
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
