package recursion;

public class Print1toN {
    static int sum = 0;

    static void sum(int i, int n) {
        if (i > n) return;
        sum = sum + i;
        sum(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 3; // 1+2+3
        sum(1, n);
        System.out.println(sum);
    }
}
