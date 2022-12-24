package bit_manipulation;

public class BitMasking {
    public static void bitIsSet() {
        int n = 13;
        int i = 1;
        int mask = (1 << i);
        if ((n & mask) != 0) {
            System.out.println("set");
        } else {
            System.out.println("Not set");
        }
    }

    public static void setBit() {
        int n = 16;
        int i = 3;
        int mask = 1 << i;
        int res = n | mask;
        System.out.println(res);
    }

    public static void main(String[] args) {
        setBit();
    }
}
