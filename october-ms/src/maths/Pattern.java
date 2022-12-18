package maths;

public class Pattern {
    // 2 12 36 80 150 252
    // 10, 24, 44, 70
    // 14, 20, 26
    public static void main(String[] args) {
        // 2, 12, 36, 80, 150
        int n = 10;
        int diff = 10;
        int num = 2;
        for (int i = 2; i <= n; i++) {
            num = num + diff;
            diff = diff + (14 + (i - 2) * 6);
            System.out.print(num + " ");
            System.out.print((i * i) + (i * i * i) + " ");
        }
    }
}
